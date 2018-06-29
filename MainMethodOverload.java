
/*Can we overload main method? 
 * yes .we can have any number of main methods in the class by method overloading. 
 * see below example */

public class MainMethodOverload {

	public static void main(int a)
	{
		System.out.println("Number invoked by main method is "+a);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method invoked");
		main(10);
		
	}

}
