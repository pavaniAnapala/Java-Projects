class SubClass{
	int speed =50;
	SubClass()
	{
	System.out.println("SubClass Constructor invoked");
	}
	void display()
	{
		System.out.println("Superc class is invloked");
	}
}
class  SuperExample extends SubClass {
	
	int speed =10;
	SuperExample()//super class constructor will be called before subclass constructor.
	{
		System.out.println("SuperExample method invoked");
	}
	
	void display(){
		super.display(); //calling super class method using super
	System.out.println("Speed is..:"+ speed);
	System.out.println("super class Speed is..:"+ super.speed);//calling super class variables using super
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperExample n = new SuperExample();
		n.display();
	}

}
