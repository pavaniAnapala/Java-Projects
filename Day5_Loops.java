package src;

import java.util.Scanner;

public class Day5_Loops {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			int n =scan.nextInt();
			scan.close();
			for(int i=1;i<=10;i++){
				System.out.println(n + " x "+i +" = "+ n*i);
			}

	}

}
