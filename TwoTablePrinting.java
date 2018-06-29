package HackerRankPrograms;
import java.util.*;
import java.text.*;

import java.io.*;
public class TwoTablePrinting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
int i= s.nextInt();

for (int j=1;j<=10;j++){
/*	System.out.print(i);
	System.out.print(" ");
	System.out.print("*");
	System.out.print(" ");
	System.out.print(j);
	System.out.print(" = ");
	System.out.print(i*j);
	System.out.println();*/
	
	System.out.printf("%d X %d = %d\n",i,j,(i*j));
}

	}

}
