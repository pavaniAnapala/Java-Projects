//Program for abstarct class and abstarct method.

abstract class Bike1{
	Bike1()
	{
		System.out.println("Bike");
	}
	abstract void run();
//	{
		//System.out.println("Run Method");
	//}
	void display()
	{
		System.out.println("Display Method");	
	}
}
class Honda extends Bike1{
	void run()
	{
		System.out.println("Run Method");
	}
}
class AbstarctionExample {

	  /**
	 * @param args
	 */ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike1 b= new Honda();
		b.run();
		b.display();
	}

}
