package Misc;

public class WrapperToPrimitive {

	
	public static void main(String[] args) {
	Integer a = new Integer(3);//Converting Integer to int
	int i = a.intValue();//converting Integer to Int
	int j=a; //unboxing , now complier will write a.intValue internally
	System.out.println(a+" "+i+" "+j);

	}

}
