package src;

import java.util.Scanner;
public class Day10_BinaryNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int digitalNum = toDigital(n);
		System.out.println(digitalNum);

	}

	private static int toDigital(int n) {
		int rem=0,s=0,t=0;
		while(n>0){
		rem=n%2;
		n=n/2;
		if(rem==1){
			s++;
			if(s>=t){
				t=s;
			}}
			else{
				s=0;
			}
		
		
		}return t;
	}

}
