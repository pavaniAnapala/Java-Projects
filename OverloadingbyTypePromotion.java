
public class OverloadingbyTypePromotion {
 void sum(int a, long b)
 {
	 System.out.println(a+b);
 }
 void sum(int p, int q, int r){
	 System.out.println(p+q+r);
 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingbyTypePromotion p1= new OverloadingbyTypePromotion();
		p1.sum(10,20); //now 20 is typecated to double.
	}

}
