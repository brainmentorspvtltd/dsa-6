

// What to do
interface Player{ // abstract interface Player
	int MAX_JUMP = 100; // public static final int MAX_JUMP = 100;
	void kick(int power); // public abstract void kick()
	public abstract void punch();
	int jump();
}

interface Magic{
	int MAX_JUMP = 150;
	void extraPowers();
	int jump();
}

class MrBission implements Player, Magic{

	@Override
	public void extraPowers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kick(int power) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int jump() {
		return Magic.MAX_JUMP;
		// TODO Auto-generated method stub
		
	}
	
}

// How to do
class Ryu implements Player{

	@Override
	public void kick(int power) {
		System.out.println("Great in Kicks Round Kicks");
		
	}

	@Override
	public void punch() {
		System.out.println("Low in Punch");
		
	}

	@Override
	public int jump() {
		
		System.out.println("Average Jump");
		return 30;
		// TODO Auto-generated method stub
		
	}
	
}
class Ken implements Player{
	@Override
	public void kick(int power) {
		System.out.println("Low in Kicks ");
		
	}

	@Override
	public void punch() {
		System.out.println("High in Punch Upper Cut");
		
	}

	@Override
	public int jump() {
		System.out.println("Average Jump");
		return 20;
		// TODO Auto-generated method stub
		
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ryu ryu = new Ryu();
		ryu.kick(20);
		int jumpValue = ryu.jump();
	}

}
