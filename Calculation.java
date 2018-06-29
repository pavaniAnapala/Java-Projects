
//calling class method by anonymous object

public class Calculation {

	void fact(int n){
		int fact=1;
		for(int i=1;i<=n;i++){
		fact = fact *i;
		}
		System.out.println("Factorial of " +n+" is " + fact);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculation().fact(5);//calling method with anonymous object.

	}

}
