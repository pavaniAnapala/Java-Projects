

//Copy values without using constructors

public class CopyConstructor2 {
	
	int id;
	String name;
	CopyConstructor2(int a, String b){
		id=a;
		name=b;
	}
	CopyConstructor2(){
		
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
		CopyConstructor2 s1= new CopyConstructor2(1,"LuckyBunny");
		CopyConstructor2 s2= new CopyConstructor2();
		s2.id=s1.id;
		s2.name=s1.name;
		s1.display();
		s2.display();
	}

}

