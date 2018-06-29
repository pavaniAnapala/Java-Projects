//program for method overloading
public class SumOverloadMethod1 {

	void sum(int a, int b)
	{
		System.out.println("Sum1 = "+ (a+b));
	}
	void sum(int p, int q,int r)
	{
		System.out.println("Sum2 = "+ (p+q+r));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOverloadMethod1 s1= new SumOverloadMethod1();
		s1.sum(10,20);
		s1.sum(20,20,20);
		
	}

}
