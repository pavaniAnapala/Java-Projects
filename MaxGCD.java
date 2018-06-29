
package HackerRankCodeChallenge;

import java.util.*;

public class MaxGCD {
     public static int maximumGcdAndSum(int[] A, int[] B){
         int maxSum =0;
         int total=0;
         int rem;
         int gcd=0;
        for(int i=0;i<A.length;i++){
               for(int j=0;j<B.length;j++){
                int a,b;
                if(A[i]>=B[j]){
                    a=A[i]; b= B[j];
                }
                else{
                    a= B[j]; b= A[i];
                }
                while(b!=0){
                    rem= a%b;
                    a= b;
                    b= rem;
                 } gcd = a;
                 if(gcd> maxSum){
                     maxSum =gcd;
                     total = A[i]+B[j];
                 }
                  
               }
               
        }
         
         return total;
         
     }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        
        for(int i=0;i<arr1.length;i++){
            arr1[i]= scan.nextInt();
        }
        for(int j=0;j<arr2.length;j++){
            arr2[j]= scan.nextInt();
        }
        scan.close();
        int res = maximumGcdAndSum(arr1, arr2);
         System.out.println(res);   
    }
}
