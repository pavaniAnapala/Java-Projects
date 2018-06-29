
public class CallMethodUsingThis1 {
void m(){
	System.out.println("m is called");
	
}
void n()
{
	m();//or can be called as this.m
	System.out.println("n is called");
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*CallMethodUsingThis1 s=new CallMethodUsingThis1();
		s.n();*/
		//can be called as below also.
		new CallMethodUsingThis1().n();
		

	}

}
