
package HackerRankAlgorithms;

import java.util.*;

public class MinMaxInArray2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        int max,min,sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
            sum =sum+arr[i];
        }
        System.out.println(sum);
            max = Math.max(arr[0],Math.max(arr[1],Math.max(arr[2],Math.max(arr[3],arr[4]))));
            min = Math.min(arr[0],Math.min(arr[1],Math.min(arr[2],Math.min(arr[3],arr[4])))); 
           System.out.println((sum-max) + " "+ (sum-min));
            
       // }
    }
}
