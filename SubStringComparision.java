package StringPrograms;
import java.util.*;
import java.lang.String;


public class SubStringComparision {
	
	public static String getSmallestAndLargest(String s, int k){
		 // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
		String smallest = "";
		String largest = "";
		String[] subSt = new String[s.length()-k+1];
		for(int i=0;i<=(s.length()-(k));i++){
			subSt[i]= s.substring(i, i+k);
			if((i>0) && (i<(s.length()/*-(k-1)*/))){
				 if((subSt[i-1].compareTo(subSt[i]))<0 ){
					//if first sbString is greater than 2nd, then swap them.
					String temp = subSt[i-1];
					subSt[i-1]= subSt[i];
					subSt[i]= temp;
				}
			}
		}System.out.println(subSt.length);
		for(int i=0;i<subSt.length;i++){
			System.out.print(subSt[i]+" ");
		}
		smallest = subSt[s.length()-(k)] ;
		largest =subSt[0];
		System.out.println();
		return smallest + " "+ largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();
		System.out.println(s.length());
	
		System.out.println(getSmallestAndLargest(s,k));

	}

}
