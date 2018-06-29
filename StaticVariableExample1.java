//Program for Static Variable
public class StaticVariableExample1 {

		int empid;
		String ename;
		static String companyName = "Google";
	/**
	 * @param args
	 */
		 StaticVariableExample1(int a, String b)
		{
			empid =a;
			ename=b;
			
		}
		void display()
		{
			System.out.println("EmpID= "+ empid+" Ename= "+ename+" CompanyName= "+companyName);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariableExample1 s1 = new StaticVariableExample1(1,"Pavani Boga");
		StaticVariableExample1 s2= new StaticVariableExample1(2, "Srinivas Boga");
		
		s1.display();
		s2.display();
	}

}
