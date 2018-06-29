package src;

import java.util.Scanner;
public class Day9_Recursion {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		int result =factorial(n);
		System.out.println(result);
		scan.close();
	}

	private static int factorial(int n) {
		int fact=n;
		if(n>1 & n <=12){
		fact = fact * factorial(n-1);
	} return fact;
	}

}
