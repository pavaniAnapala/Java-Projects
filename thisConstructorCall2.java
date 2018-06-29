
public class thisConstructorCall2 {

	int id;
	String name;
	String city;
	/**
	 * @param args
	 */
	thisConstructorCall2(int id, String name){
		this.id=id;
		this.name=name;
	}
	thisConstructorCall2(int id, String name, String city){
		this(id,name);//call to other constructor.this should be in first line else error
		this.city=city;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+city);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisConstructorCall2 s1=new thisConstructorCall2(1, "BunnyLucky");
		s1.display();
		thisConstructorCall2 s2=new thisConstructorCall2(2,"SrinivasPavani","Hyderabad");
		s2.display();
	}

}
