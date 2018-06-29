package src;

import java.util.Scanner;
public class Day6_EvenOddCharsInString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String st[] = new String[n];
		String strEven, strOdd;
		for(int i=0;i<n;i++)
		{	
			st[i] = scan.next();
		}
		for(int i=0;i< n;i++){
			strEven="";
			strOdd="";
			for(int j=0;j<st[i].length();j++){
				if(j==0 | j%2==0)
					strEven = strEven+ st[i].charAt(j); 
				else
					strOdd = strOdd + st[i].charAt(j);
			} System.out.println(strEven + " "+ strOdd);
			scan.close();
		}
		
		
	}
}


