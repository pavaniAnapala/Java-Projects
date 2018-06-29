package Misc;

public class PrimitiveToWrapper {

	
	public static void main(String[] args) {
		//Converting int into Integer
		int a =20;
		Integer p = Integer.valueOf(a);
		Integer s = a;//autoboxing - now complier will write integer.valueOf internally
		System.out.print(a+" "+p+ " "+s);

	}

}
