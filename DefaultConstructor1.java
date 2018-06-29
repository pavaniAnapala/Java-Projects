
public class DefaultConstructor1 {

	/**
	 * @param args
	 */
	DefaultConstructor1()
	{
		//Default constructor call
		System.out.println("Default Constructor called");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultConstructor1 s1 = new DefaultConstructor1();//Default constructor will be called.
		System.out.println("Regular flow revoked");
	}

}
/*Rule: If there is no constructor in a class, 
 * compiler automatically creates a default constructor.*/
/*What is the purpose of default constructor?

Default constructor provides the
 default values to the object like 0, null etc. depending on the type.*/
