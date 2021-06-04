

class Account{
	String name;
	double balance;
	String transactionType;
	double roi;
	public void printBalance() {
		System.out.println("Balance is "+balance);
	}
	protected Object computeROI() {
		System.out.println("I am Parent ROI ");
		roi = 0.0;
		return 0.0;
	}
}
class SavingAccount extends Account{
	void doorToDoorService() {
		System.out.println("Collect Money from Customer");
	}
	@Override
	 public String computeROI() {
		super.computeROI();
		roi = 4;
		System.out.println("ROI Set in SA "+roi);
		return "Hi";
	}
	void computeROI(int x) {
		
		roi = 4;
		System.out.println("I am Overloading Not Overriding ROI Set in SA "+roi);
	}
	void doFD() {
		System.out.println("Saving Amount Convert FD");
	}
}
class CurrentAccount extends Account{
	
	void odLimit(){
		System.out.println("OD Limit");
	}
	@Override
	public Object computeROI() {
		roi = 5;
		System.out.println("ROI Set in CA "+roi );
		return roi;
	}
}


public class ISADemo {

	public static void main(String[] args) {
		
//		Object w = 100;
//		w = 200;
//		w = "hello";
//		w = true;
//		w = 20.90;
		
		SavingAccount savingAccount = new SavingAccount();
		savingAccount.computeROI();
		savingAccount.printBalance();
		savingAccount.doFD();
		savingAccount.doorToDoorService();
		
		System.out.println("*****************************");
		CurrentAccount currentAccount = new CurrentAccount();
		currentAccount.computeROI();
		currentAccount.printBalance();
		currentAccount.odLimit();

	}

}
