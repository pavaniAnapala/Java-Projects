

package HackerRankAlgorithms;
import java.util.*;
import java.text.DecimalFormat;

public class PlusMinus {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int n =scan.nextInt();
        int[] a= new int[n];
        int positives=0, negatives=0, zeroes =0;
        for(int i=0;i<n;i++){
            a[i] =scan.nextInt();
            if(a[i]>0){
               positives = positives +1; 
            }
            if(a[i]<0){
               negatives= negatives+1 ;
            }
            else if(a[i]==0){
                zeroes = zeroes+1;
            }
        }
        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println(df.format((double) positives/n));
        System.out.println(df.format((double) negatives/n));
        System.out.println(df.format((double) zeroes/n));
        
    }
}
