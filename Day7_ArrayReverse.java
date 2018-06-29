package src;

import java.util.Scanner;
public class Day7_ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = scan.nextInt();
		}
		for(int j=n-1;j>=0;j--){
			System.out.print(arr[j]+" ");
			
		}scan.close();
	}

}
