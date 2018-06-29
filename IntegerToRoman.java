
package CodeChallenge;
import java.util.Scanner;

public class IntegerToRoman {
    public static String IntegerToRomanConversion(int num){
        String[] roman = { "M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] n= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String output ="";
        for(int i=0;i<n.length;i++){
            while(num>=n[i]){
                output = output+ roman[i];
                num =num-n[i];
            }
        }return output;
    }
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int num = scan.nextInt();
        String st = IntegerToRomanConversion(num);
        System.out.println(st);
    }
}
