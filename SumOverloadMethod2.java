//program for method overloading by changing datatype of arguments

public class SumOverloadMethod2 {

	void sum(int a, int b)
	{
		System.out.println("Sum1 = "+ (a+b));
	}
	void sum(double p, double q)
	{
		System.out.println("Sum2 = "+ (p+q));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOverloadMethod2 s1= new SumOverloadMethod2();
		s1.sum(10,20);
		s1.sum(20.2,20.2);
	}
}
