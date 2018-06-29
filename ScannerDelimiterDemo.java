package src;

import java.util.*;
public class ScannerDelimiterDemo {

	public static void main(String[] args) {
		Scanner scan =new Scanner("Pavani/34/Female");
		scan.useDelimiter("/");
		System.out.println("The delimiter used is "+ scan.delimiter());
		//print the tokenised strings
		while(scan.hasNext()){
			System.out.println(scan.next());
		} scan.close();
	}

}
