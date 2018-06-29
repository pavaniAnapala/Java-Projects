
public class CounterWOStatic {
	int count=0;// not using static so this will get memory when instance is created

	/**
	 * @param args
	 */
	CounterWOStatic()
	{
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterWOStatic s1 =new CounterWOStatic();
		CounterWOStatic s2=new CounterWOStatic();
		CounterWOStatic s3 = new CounterWOStatic();
	}

}
