
public class thisConstructorCall1 {
int id;
String name;
thisConstructorCall1()
{
	System.out.println("Default constructor called");
}
thisConstructorCall1(int id, String name)
{
	this();
	this.id=id;
	this.name=name;
	//this();//error as call to default constructor should be first in this block.
}
void display(){
	System.out.println("ID="+id+" name= "+name);
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//thisConstructorCall1 s1=new thisConstructorCall1();
		thisConstructorCall1 s2= new thisConstructorCall1(1, "Pavani");
		//s1.display();
		s2.display();
		thisConstructorCall1 s3= new thisConstructorCall1(2,"Srinivas");
		s3.display();
	}

}
