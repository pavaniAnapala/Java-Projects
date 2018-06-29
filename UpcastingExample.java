//Example of Java Runtime Polymorphism
class Bike{
	void run()
	{
		System.out.println("Bike is Running");
	}
}
 class UpcastingExample  extends Bike{
//assume class Upcasting renamed as Splendor bike
	void run()
	{
		System.out.println("Splendor Bike is Running");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Bike b = new UpcastingExample();//upcating ie.,variable of superclass refer subclass object
 b.run();
	}

}
