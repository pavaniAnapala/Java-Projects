//Running time and space complexity program. 
package HackerRankPrograms;
import java.util.*;

public class PrimeNotPrimeSpaceAndTimeComplexity {
    public static void isPrime(int n){
        int count =0;
        int reminder;
        int sqrt =(int) Math.sqrt(n);
        if(n==2)System.out.println("Prime");
       if(/*n==4 || */n==1)System.out.println("Not prime");
        else if((n>2)){
        for(int i=2;i<=sqrt;i++){
          reminder = n%i;
          if(reminder ==0){count++; break;}
         }
        if(count>0) {
            System.out.println("Not prime");
        }
        else{System.out.println("Prime");
     }
        }      
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]= scan.nextInt();
            isPrime(a[i]);
        }scan.close();
    }    
}