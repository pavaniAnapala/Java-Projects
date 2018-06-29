

package HackerRankPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExExample {
    public static void main(String[] args){
        String s = "HEllo GoodBye Farewell";
        Pattern p= Pattern.compile("\\p{Alpha}+");
        Matcher m = p.matcher(s);
        
        while(m.find()){
            System.out.println(m.group());
        }
        
    } 
}
