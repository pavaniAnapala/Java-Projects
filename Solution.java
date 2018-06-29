
package HackerRankInterface;
import java.util.*;

class Calculator implements AdvancedArithmetic{
//override methods from interface AdvancedArithmetic
    public int divisorSum(int n){
        int sum =0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0){
                sum=sum+i;
            }
        }
        return sum;
    }
}
public class Solution {
   public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();
     scan.close();
     
    AdvancedArithmetic myCalc = new Calculator();
    int sum = myCalc.divisorSum(n);
    System.out.println(myCalc.getClass().getInterfaces()[0].getName()+" "+   sum);
     
   } 
}
