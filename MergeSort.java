
package sortings;
import java.util.*;

public class MergeSort {
      // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    public static void merge(int[] a , int left, int mid,int right){
      //Find sizes of two subArrays to be merged
      int n1 = mid-left+1;
      int n2 = right-mid;
      
      //Create temp arrays
      int L[] = new int[n1];
      int R[]= new int[n2];
      
      //Copy data to temp arrays
      for(int i=0;i<n1;i++){
          L[i] = a[left+i];
         }
          for(int j=0;j<n2;j++){
              R[j]=a[mid+1+j];
          }
       //Merge both the arrays
       /* Merge the temp arrays back into arr[l..r]*/
    int i = 0; // Initial index of first subarray
    int j = 0; // Initial index of second subarray
   int  k = left; // Initial index of merged subarray
       while (i < n1 && j < n2)
    {
        if (L[i] <= R[j])
        {
            a[k] = L[i];
            i++;
        }
        else
        {
            a[k] = R[j];
            j++;
        }
        k++;
    } /* Copy the remaining elements of L[], if there
       are any */
    while (i < n1)
    {
        a[k] = L[i];
        i++;
        k++;
    }
 
      
    }
    public static void sort(int[] a, int left, int right){
       if(left < right){
           //find the middle point
           int mid = (int) ((left+right-1)/2);
           //sort 1st and 2nd halves
           sort(a, left,mid);
           sort(a,(mid+1),right);
           
           //Merge the sorted halves
           merge(a,left,mid, right);
       }
    }
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
        sort(a, 0,a.length-1);
        printarr(a);
        
    }
}
