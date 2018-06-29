

package CodeChallenge;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class IntToRoman {
       public static String IntToRoman(int n){
                String roman="";
                if(n>0 && n<4000){
                    final LinkedHashMap<Integer, String> romanList = new LinkedHashMap<>();
                    romanList.put(1000,"M");
                    romanList.put(900,"CM");
                    romanList.put(500,"D");
                    romanList.put(400,"CD");
                    romanList.put(100,"C");
                    romanList.put(90,"XC");
                    romanList.put(50,"L");
                    romanList.put(40,"XL");
                    romanList.put(10,"X");
                    romanList.put(9,"IX");
                    romanList.put(5,"V");
                    romanList.put(4,"IV");
                    romanList.put(1,"I");
                                       
                   for(Map.Entry<Integer,String> entry : romanList.entrySet()){
                     
                       int totalFind = n/entry.getKey();
                       roman =roman+ recurse(entry.getValue(),totalFind);
                       n = n% entry.getKey();
                    
                    }
                    return roman;
                }
                
                return roman;
            }
       public static String recurse(String st, int n){
           if(st==null){
               return null;
           }
           final StringBuilder sb =new StringBuilder();
           for(int i=0;i<n;i++){
               sb.append(st);
           }
           return sb.toString();
       } 
       
        public static void main(String[] args){
            Scanner scan =new Scanner(System.in);
            int n = scan.nextInt();
            String roman = IntToRoman(n);
            System.out.println("Roman Equivalent of "+ n+" is "+ roman);
        }
}
