/*The this keyword can also be passed as an argument in the method. 
 * It is mainly used in the event handling. Let's see the example:
*/
public class PassingThisAsArg {
void m(PassingThisAsArg obj){
	System.out.println("Method called");
}
void p(){
	m(this);

}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassingThisAsArg n=new PassingThisAsArg();
		n.p();
	}

}
