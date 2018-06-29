
package HackerRankCodeChallenge;
import java.util.*;

public class TramNumber {
    public static int SumOfNum(int n){
        int reminder1 = n/100;
        int divisor1 = n%100;
        int reminder2 = divisor1/10;
        return (reminder1+ reminder2+ (divisor1%10));
        
        
    }
    public static String OnceInATram(int x){
        String output="";
        int num = x+1;
        int first3Nums = num /1000;
        int last3Nums= num %1000;
        System.out.println("1st 3 numbers.."+first3Nums);
        System.out.println("Last 3 Numbers...:"+last3Nums);
        int first3NumSum = SumOfNum(first3Nums);
        int last3NumSum = SumOfNum(last3Nums);
        System.out.println("1st 3 numbers sum.."+first3NumSum);
        System.out.println("Last 3 Numbers sum...:"+last3NumSum);
         if(first3NumSum == last3NumSum){
                   output = Integer.toString(num);
                   System.out.println("Output is "+ output);
                   return output;
               }
        
        while(first3NumSum != last3NumSum){
            int i =num+1;
            System.out.println("X+1 is"+ i);
               first3Nums = i/1000;
               last3Nums= i%1000; 
                System.out.println("1st 3 numbers.."+first3Nums);
                 System.out.println("Last 3 Numbers...:"+last3Nums);
               first3NumSum = SumOfNum(first3Nums);
               last3NumSum = SumOfNum(last3Nums);
                System.out.println("1st 3 numbers sum.."+first3NumSum);
                System.out.println("Last 3 Numbers sum...:"+last3NumSum);
               if(first3NumSum == last3NumSum){
                   output = Integer.toString(i);
                   System.out.println("Output is "+ output);
               }
            num++;
        }
        
        return output;
    }
public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        //Enter 6 digit number
        int n=scan.nextInt();
        String result = OnceInATram(n);
        System.out.println(result);
    }
}
