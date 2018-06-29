package src;

import java.util.Scanner;
public class Alg_Warmup_DiagDIff {
private static int diagDifference(int[][] a){
	int n = a.length;
	int sum =0;
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(i==j){
				sum=sum+a[i][j];
			}
		}
		
	}
	return sum;
	
}
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n =scan.nextInt();
		int[][] a= new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.println("Ënter" + i + "  "+ j+" Values..:" );
				a[i][j]=scan.nextInt();
			}
		}
		int result = diagDifference(a);
		System.out.println(result);
		scan.close();
	}

}
