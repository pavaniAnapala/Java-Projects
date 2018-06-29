package src.CodeTest;

import java.util.Scanner;
public class CheckPrime {
	
	public static boolean isPrime(int n){
		if(n==2 || n ==3){
			return true;
		}
		if(n<=1){
			return false;
		}
		else{
			for(int i =2;i<=Math.sqrt(n);i++){
					if(n%i ==0){
						return false;
					}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int n= scan.nextInt();
		boolean result = isPrime(n);
		System.out.println(result);
	}

}
