

/*In java, method overloading is not possible by changing the
 *  return type of the method because there may occur ambiguity.
 *  Let's see how ambiguity may occur: */
public class OverloadReturnTypeCompileError {

	/**
	 * @param args
	 */
	void sum(int a, int b){
		System.out.println(a+b);
	}
/*	double sum(int p, int q){
		System.out.println(p+q);
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadReturnTypeCompileError s1= new OverloadReturnTypeCompileError();
		s1.sum(2,3);
	}

}
