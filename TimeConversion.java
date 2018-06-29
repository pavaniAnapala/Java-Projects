
package HackerRankAlgorithms;
import java.util.*;

public class TimeConversion {
    static String timeConversion1(String s){
        char ch =s.charAt(s.length()-2);
        String output1 = s.substring(2,s.length()-2);
        String output2="";
        String finalOutput="";
        String hr = s.substring(0,2);
        System.out.println("Char is "+ch);
        System.out.println("Hr is "+ hr);
        System.out.println(s);
        if((ch=='A') && ("12".equals(hr))){
            output2 =  "00";
        }
        else if(ch=='A' ){
            finalOutput= s.substring(0,s.length()-2);
            return finalOutput;
        }
        else if((ch=='P')&&("12".equals(hr))){
         finalOutput= s.substring(0,s.length()-2);
            return finalOutput;
     }
        else{
           int hr1= Integer.parseInt(hr)+12;
            output2 = Integer.toString(hr1);
        }
        finalOutput =output2.concat(output1);
        
        return finalOutput;
    }

    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        
        //Enter time in 12-hour clock format (i.e.:hh:mm:ssAM or hh:mm:ss:PM ),
        //where 0<=h<=12 and 0<=mm<=59
        String s = scan.next();
        String result = timeConversion1(s);
        System.out.println(result);
    }
}
