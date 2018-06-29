/*Print a staircase of size using # symbols and spaces*/

package HackerRankAlgorithms;
import java.util.*;
import java.io.*;
public class StairCase {
    public static void printSymbol(int n){
        String st ="#";
      // Str= String.format(format, args)
      for(int i=0;i<n;i++){
         System.out.printf("%"+(n+1)+"s",st+"\n");//N+1 IS THE SIZE (LENGHT) OF THE STRING.
         st = st+"#";//EACH TIME ONE MORE # IS ADDED TO THE NEW LINE.
      }
        //System.out.println();
    }
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
      //  for(int i=1;i<=n;i++){
           printSymbol(n);  
        //}
       
    }

}
