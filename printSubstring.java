package StringPrograms;
import java.util.Scanner;
import java.lang.String;

public class printSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String st = scan.next();
		int start = scan.nextInt();
		int end = scan.nextInt();
		System.out.println(st.substring(start, end));
	}

}
