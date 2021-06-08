import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;

abstract interface ICard{ // abstract interface ICard
	public static final int MAX_LIMIT = 100;
	public abstract double getBalance();
	public abstract int transRate();
	void service();
	boolean worldWide();
	int noOfDaysToPay(); // public abstract int noOfDayToPay(); 
	default void bonus() {
		
	}
}

//final abstract class VV{
//	
//}

abstract class CardAdapter implements ICard{

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int transRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void service() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean worldWide() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int noOfDaysToPay() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class Silver extends CardAdapter{
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	public int transRate() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public void service() {
		System.out.println("NetBanking , PAYTM");
		// TODO Auto-generated method stub
		
	}

	
	
}

public class CardExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MouseListener l ;
		MouseAdapter m;
		Silver silver = new Silver();
		System.out.println(silver.getBalance());
		System.out.println(silver.transRate());
		silver.service();
		System.out.println(silver.worldWide());
		System.out.println(silver.noOfDaysToPay());

	}

}
