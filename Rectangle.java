
public class Rectangle {
	int len,wid;
	void insert(int a, int b){
		len=a;
		wid=b;
	}
	void calArea()
	{
		System.out.println("Area = "+ len*wid);
	}
	public static void main(String args[])
	{
		//Rectangle r1= new Rectangle();
		//Rectangle r2= new Rectangle();
		
		Rectangle r1= new Rectangle(),r2 = new Rectangle();
		//Creating two objects at same time
		
		r1.insert(10,2);
		r2.insert(5,5);
		
		r1.calArea();
		r2.calArea();
		
	}

}
