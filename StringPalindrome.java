package StringPrograms;
import java.util.Scanner;
import java.lang.String;
public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String A = scan.next();
		scan.close();
		System.out.println(A.equals(""+new StringBuilder(A).reverse())?"Yes": "No");
		
	}

}
