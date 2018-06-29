

package CodeChallenge;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class IntToRomanDemo {
       public static String IntToRoman(int n){
                String roman="";
                if(n>0 && n<4000){
                    final HashMap<Integer, String> romanList = new HashMap<>();
                    romanList.put(1,"I");
                    romanList.put(4,"IV");
                    romanList.put(5,"V");
                    romanList.put(9,"IX");
                    romanList.put(10,"X");
                    romanList.put(40,"XL");
                    romanList.put(50,"L");
                    romanList.put(90,"XC");
                    romanList.put(100,"C");
                    romanList.put(400,"CD");
                    romanList.put(500,"D");
                    romanList.put(900,"CM");
                    romanList.put(1000,"M");
                    
                   /* System.out.println(romanList.clone()); //Displays the following
                    //{1=I, 4=IV, 100=C, 900=CM, 5=V, 40=XL, 1000=M, 9=IX, 10=X, 400=CD, 50=L, 500=D, 90=XC}
                    
                    System.out.println(romanList.entrySet());//returns the same result as above
                    System.out.println(romanList.size());
                    System.out.println(romanList.keySet());
                    System.out.println(romanList.values());*/
                   
               
                
            }return roman;
       }
       
        public static void main(String[] args){
            Scanner scan =new Scanner(System.in);
            int n = scan.nextInt();
            String roman = IntToRoman(n);
            System.out.println("Roman Equivalent of "+ n+" is "+ roman);
        }
}
