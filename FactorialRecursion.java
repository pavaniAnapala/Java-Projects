package HackerRankPrograms;
import java.util.*;
public class FactorialRecursion {
	
		static int factorial(int n){
			int fact=n;
			if(n>1 & n <=12){
			fact = fact * factorial(n-1);
		} return fact;
			}
		public static void main(String args[])
		
		{
		Scanner scan = new Scanner(System.in);	
		int f =scan.nextInt();
		int p= factorial(f);
		System.out.println(p);
		}
}
