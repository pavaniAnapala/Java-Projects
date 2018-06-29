
public class StaticBlock1 {
	static String name="Pavani";
	/*Static block below
	 * Is used to initialize the static data member.
It is executed before main method at the time of classloading.*/
static{
	System.out.println("Static block called");
	name="Srinivas";
}
void disp(){
	System.out.println("Non Static block called");
	System.out.println(name);
}
static void change()
{
	name="Pavani";
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlock1 b1=new StaticBlock1();
		b1.disp();
		change();
		b1.disp();
	}

}
