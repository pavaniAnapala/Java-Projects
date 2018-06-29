
package HackerRankPrograms;
import java.util.*;

public class StringConcatProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i= scan.nextInt();
		double d=scan.nextDouble();
		String s1= scan.nextLine();
		String s2 = scan.nextLine();
		System.out.println("String1 is..."+s1);
		System.out.println("String2 is..."+s2);
		System.out.println("Integer is ..:"+i);
		System.out.println("Double is..:"+d);
		System.out.println("COncat is ..:"+s1.concat(s2));
		
	}

}
