
package sortings;

import java.util.*;
public class BubbleSort {
       public static void main(String[] args){
           Scanner scan =new Scanner(System.in);
           int n= scan.nextInt();
           int[] a = new int[n];
           for(int i=0;i<n;i++){
               a[i]= scan.nextInt();
           }
           //Bubble Sort
           for(int i=0;i<n-1;i++){
               for(int j=0;j<n-i-1;j++){
                   int tmp=0;
                   if(a[j]>a[j+1]){
                       tmp = a[j];
                       a[j]=a[j+1];
                       a[j+1] =tmp;
                   }
               }
           }
           //Print Sorted Array
           System.out.println("Sorted array is...:");
           for(int i=0;i<n;i++){
               System.out.print(a[i]+" ");
           }
       }
}
