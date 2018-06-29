package sortings;
import java.util.*;


public class InsertionSort {
    //Method to sort the array
    public static void insertSort(int[] a){
        int tmp=0;
        for(int i=1;i<a.length;i++){
            for(int j=i;j>0;j--){
                if(a[j] < a[j-1]){
                    tmp =a[j-1];
                    a[j-1]=a[j];
                    a[j] = tmp;
                }
            }
        }System.out.println("Sorted array is...");
            printarr(a);
    }
    //Method to print the array
    public static void printarr(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //Get Array
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        scan.close();
        printarr(a);
        
        //Method to sort the array
        insertSort(a);
        
        
    }
}
