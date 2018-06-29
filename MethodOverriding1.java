 class Bank{
	int getInterest(){
		return 0;
	}
}
class SBI extends Bank{
	int getInterest(){
		return 5;
	}
}
class ICICI extends Bank{
	int getInterest()
	{
		return 10;
	}
}
class AXIS extends Bank
{
	int getInterest(){
		return 7;
	}
}
public class MethodOverriding1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sbi=new SBI();
		ICICI icici = new ICICI();
		AXIS axis = new AXIS();
		System.out.println("SBI Interest Rate is..:"+sbi.getInterest());
		System.out.println("AXIS Interest Rate is..:"+axis.getInterest());
		System.out.println("ICICI Interest Rate is..:"+icici.getInterest());
	}

}
