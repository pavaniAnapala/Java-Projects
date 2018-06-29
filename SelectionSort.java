package sortings;
import java.util.*;

public class SelectionSort {
    
        public static void selectSort(int[] a){
        int tmp , min;
        for(int i=0;i<a.length;i++){
            min =i;
            for(int j=i+1;j<a.length;j++){
               if(a[j]<a[min]) {
                   min=j;//find min index first, then swap
               }
            }
            tmp = a[i];
            a[i]=a[min];
            a[min]= tmp;
        }
        System.out.println("Sorted array is...");
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
        selectSort(a);
        
        
    }
}
