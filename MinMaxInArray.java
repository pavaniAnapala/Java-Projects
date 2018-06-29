/*Given five positive integers, find the minimum and maximum values that
can be calculated by summing exactly four of the five integers. Then print 
the respective minimum and maximum values as a single line of two
space-separated long integers.*/

package HackerRankAlgorithms;
import java.util.*;
public class MinMaxInArray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];
        //take the input
        for(int i=0;i<5;i++)
        {
            a[i] =scan.nextInt();
            
        }
        //Bubble Sort
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                //swap if numbers are not in order
                if(a[i]>a[j]){
                    int tmp = a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
        //print the sorted array
        for(int i=0;i<5;i++){
            System.out.print(a[i]+ " ");
        }
        //Print Max Sum and Min Sum
        int maxSum = 0;
        int minSum=0;
        for(int i=0;i<a.length;i++){
            if(i!= 0){
            maxSum =maxSum +a[i];}
            if(i!=a.length-1){
                minSum = minSum +a[i];
            }
        }
        System.out.println(minSum + " "+ maxSum);
    }
}
