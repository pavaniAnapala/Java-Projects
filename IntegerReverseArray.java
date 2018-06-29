package HackerRankPrograms;
import java.util.*;
public class IntegerReverseArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
int i= scan.nextInt();
int[] arr=new int[i];
for(int j=0;j<i;j++){
	arr[j]=scan.nextInt();
}
System.out.println(arr.length);
for(int k=0;k<arr.length;k++){
	System.out.println(arr[k]);
}
System.out.println(arr.length);

	for(int m=((arr.length) -1);m>=0;m--){
	System.out.println(arr[m]);
	}

	}

}
