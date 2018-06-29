//Combination of Abstarct class and Interface 
interface A{
	void a();
	void b();
	void c();
	void d();
}
abstract class B implements A{
	public void a(){
		System.out.println("A Printed..");
	}
}
class C extends B{
	public void b(){
		System.out.println("B Printed..");
	}
	public void c(){
		System.out.println("C Printed..");
	}
	public void d(){
		System.out.println("D Printed..");
	}
}
public class AbstarctInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 A a = new C();
 a.a();
 a.b();
 a.c();
 a.d();
 //(a instanceof A);
	}

}
