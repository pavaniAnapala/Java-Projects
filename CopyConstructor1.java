

//Copy values using constructors

public class CopyConstructor1 {
	
	int id;
	String name;
	CopyConstructor1(int a, String b){
		id=a;
		name=b;
	}
	CopyConstructor1(CopyConstructor1 x){
		id=x.id;
		name=x.name;
	}
	void display()
	{
		System.out.println("Id= "+id+" Name ="+ name);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyConstructor1 s1= new CopyConstructor1(1,"LuckyBunny");
		CopyConstructor1 s2= new CopyConstructor1(s1);
		s1.display();
		s2.display();
	}

}
