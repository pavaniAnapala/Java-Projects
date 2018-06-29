

import java.util.*;

public class Day29BitWiseExample {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        
       int[] result = new int[T];
       int start =0;
       for(int p=0;p<T;p++){
           int maxValue =0;
           int N = scan.nextInt(); //Enter n Value
           int K = scan.nextInt(); //k should be >2 and < n
          //System.out.println("N ="+N+" k = "+K);
           for(int a= 1;a<N;++a) {
               for(int b=a+1;b<=N;++b){
                   int value = a & b;
                  // System.out.println("a &b  is"+value);
                  if(value< K ){
                      
                   maxValue = Math.max(value, maxValue);
                    result[start]=maxValue; 
                   if(maxValue == K-1) break;
                  
               }
               }//System.out.println(maxValue);
           }   start++; 
       }
    
         for(int l=0;l< result.length;l++){
             System.out.println(result[l]);
         
       }
    }
}


