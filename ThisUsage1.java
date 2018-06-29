
public class ThisUsage1 {
int id;
String name;
ThisUsage1(int id, String name)
{
	this.id=id;//if we dont use this keyword here, output will be 0
	this.name=name; //if we dont use this keyword here, output will be null
}
void display()
{
	System.out.println("ID= "+id+" Name= "+name);
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisUsage1 s1= new ThisUsage1(1,"LuckyBunny");
		ThisUsage1 s2=new ThisUsage1(2, "PavaniSrinivas");
		s1.display();
		s2.display();

	}

}
