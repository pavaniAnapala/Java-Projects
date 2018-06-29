package src;

import java.util.Scanner;
//Compare the Triplets - Algorithms Warmup
public class Alg_Warmup_CompTriplets {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[] = new int[3];
		int b[]=new int[3];
		int aSum=0, bSum=0;
		for(int i=0;i<3;i++){
			a[i] = scan.nextInt();
		}
		for(int j=0;j<3;j++){
			b[j] = scan.nextInt();
		}
		//Compare the triplets
		for(int k=0;k<3;k++){
			if(a[k] >b[k]){aSum =aSum+1;};
			if(a[k]<b[k]){bSum =bSum+1;};
		}
		System.out.println(aSum+" "+bSum);
		scan.close();
	}

}
