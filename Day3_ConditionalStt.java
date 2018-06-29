package src;

import java.util.Scanner;
public class Day3_ConditionalStt {

	static void check(int n){
		if(n>0){
			if(n%2 !=0)System.out.println("Weird"); //Odd
			
			if(n%2 ==0){
				if(n>=2 & n<5) System.out.println("Not Weird");//Even and between 2 & 5 ,Not Weird
				else	if(n>=6 & n<=20) System.out.println("Weird"); //Even and in range of 6 to 20 , Weird
				else if(n>20) System.out.println("Not Weird"); //Even and greater than 20,Not Weird
			}
			
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		check(n);
	}

}
