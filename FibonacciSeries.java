
package InterviewCoding;
import java.util.*;

public class FibonacciSeries {
    
    public static int fib(int n){
        if((n==1 )|| (n==2)){
            return 1;
        }
        return(fib(n-1)+fib(n-2));
      
    }
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
       // System.out.println(1);
       for(int i=1;i<=n;i++){
           System.out.print(fib(i)+" ");
       }
        //fib(n);
    }
}
