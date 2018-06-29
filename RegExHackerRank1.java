

package HackerRankPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExHackerRank1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String st = ".@gmail\\.com$";
       // Pattern p = Pattern.compile("[.@gmail\\.com$]+]");
        Pattern p = Pattern.compile(st);
        List<String> list = new ArrayList();
        int n = scan.nextInt();
        for(int i =0;i<n; i++){
            String name =scan.next();
            String email = scan.next();
            Matcher m =p.matcher(email);
            
            if(m.find()){
               // System.out.println(m.group());
               list.add(name);
            }
        }
            Collections.sort(list);
            for(String name:list){
                System.out.println(name);
            }
        }
}
