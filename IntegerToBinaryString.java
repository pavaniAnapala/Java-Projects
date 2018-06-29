package HackerRankPrograms;
import java.util.*;

public class IntegerToBinaryString {
		static int digital(int n){
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
public static void main(String[] args) {
	
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			int digitalnum = digital(num);
			System.out.println("count of 1's are " + digital(num));

	}

}
