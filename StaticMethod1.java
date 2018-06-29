//Program of changing the common property of all objects(static field).  
public class StaticMethod1 {

	/**
	 * @param args
	 */
	int eid;
	String ename;
	static String domain ="Aero";//This variable value can be changed only thru static method
	StaticMethod1(int a, String b)
	{
		eid=a;
		ename=b;
	}
	static void changeDomain()
	{
		domain="ACS";
//static method can change only static variable value , cannot change non static variable value
	}
	void display()
	{
		System.out.println("Eid = "+eid+" Ename = "+ename+" Domain Name= "+domain);                                 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod1 s1= new StaticMethod1(1, "Pavani");
		s1.display();
		changeDomain();//static method can be called without class reference
		s1.display();
	}

}
