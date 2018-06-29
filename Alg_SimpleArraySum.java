package src;
import java.util.Scanner;
//Simple Array Sum - Algorithm Warmup
public class Alg_SimpleArraySum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum =0;
		int a[]= new int[n];
		for(int i=0;i<n;i++){
			a[i] = scan.nextInt();
			sum= sum+a[i];
		}
		System.out.println(sum);
		scan.close();
	}

}
