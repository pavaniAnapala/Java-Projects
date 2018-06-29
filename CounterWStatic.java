public class CounterWStatic {
	static int count=0;// using static so this will get memory only once when instance is created

	/**
	 * @param args
	 */
	CounterWStatic()
	{
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterWStatic s1 =new CounterWStatic();
		CounterWStatic s2=new CounterWStatic();
		CounterWStatic s3 = new CounterWStatic();
	}

}
