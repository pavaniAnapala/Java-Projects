
//Example of parameterized constructor


public class ParametrConstructor1 {
int id;
String name;
ParametrConstructor1(int a, String b)
{
	id =a;
	name=b;
}
void display()
{
	System.out.println ("ID = "+ id+ " Name = "+name);
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParametrConstructor1 s1= new ParametrConstructor1(1, "LuckyBunny");
		ParametrConstructor1 s2= new ParametrConstructor1(2, "SeenuPavani");
		s1.display();
		s2.display();
	}

}
