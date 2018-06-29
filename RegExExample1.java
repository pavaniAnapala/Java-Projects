

package HackerRankPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExExample1 {
    public static void main(String[] args){
        String s= "Srini Pavani Lucky Bunny";
        Pattern p= Pattern.compile("[a-zA-Z\\s]+");
        Matcher m= p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
    }

}
