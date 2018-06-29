
//Example of COnstructor Overload

public class ConstructorOverload1 {

	int id;
	String name;
	int age;
	ConstructorOverload1(int a, String b){
		id=a;
		name=b;
	}
	ConstructorOverload1(int p, String q, int r){
		id=p;
		name=q;
		age=r;
	}
	void display()
	{
		System.out.println("ID = "+id+" Name = "+ name+" age = "+age);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverload1 s1= new ConstructorOverload1(1,"LuckyBunny");
		ConstructorOverload1 s2=new ConstructorOverload1(2,"SeenuPavani",2);
		s1.display();
		s2.display();
	}

}
