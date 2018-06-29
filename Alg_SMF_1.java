package src;

import java.util.Scanner;

//Solve Me First -Algorithm Warmup

public class Alg_SMF_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			int a= in.nextInt();
			int b= in.nextInt();
			int sum = solveMeFirst(a,b);
			System.out.println(sum);
			in.close();
			
	}

	private static int solveMeFirst(int a, int b) {
		
		return a+b;
	};

}
