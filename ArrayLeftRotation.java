import java.util.*;
public class ArrayLeftRotation {
	 public static int[] arrayLeftRotation ( int[] arr1,int  size,int m){
		 int[] arr2 = new int[size];
		 for(int i= 0;i<size;i++)
		 {
			 int newPos = (i+(size-m)) % size;
			 System.out.println("New Position = "+ newPos);
			 arr2[newPos] = arr1[i];
		 }
		 return arr2;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int size=scan.nextInt();
		int m= scan.nextInt();
		int arr1[]= new int[size];
		for(int i=0;i<size;i++){
			arr1[i]= scan.nextInt();
		}
		int arr2[]= new int[size];
		arr2  = arrayLeftRotation ( arr1, size, m);
		for(int i=0;i<size;i++){
			System.out.print(" " + arr2[i]);
		}scan.close();
	}
}

