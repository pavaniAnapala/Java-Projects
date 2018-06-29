
public class Student2 {
	int id;
	String sname;
void insertRecord(int s1, String st)
{
	id=s1;
	sname=st;
}
void displayRecord()
{
	System.out.println("Roll Number = "+id);
	System.out.println("Student Name = "+sname);
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student2 t1= new Student2();
Student2 t2= new Student2();
t1.insertRecord(1,"Lucky");
t2.insertRecord(2,"Bunny");
t1.displayRecord();
t2.displayRecord();
	}

}
