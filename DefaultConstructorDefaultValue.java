
public class DefaultConstructorDefaultValue {

	int id;
	String name;
	
	void display()
	{
		System.out.println("id = "+ id+" Name = "+name);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultConstructorDefaultValue t1= new DefaultConstructorDefaultValue();
		DefaultConstructorDefaultValue t2= new DefaultConstructorDefaultValue();
		t1.display();
		t2.display();

	}

}
