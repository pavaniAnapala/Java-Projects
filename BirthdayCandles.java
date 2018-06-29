
package HackerRankAlgorithms;
import java.util.*;
public class BirthdayCandles {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); 
        int[] a= new int[n]; 
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
            if(a[i]>max){
                max=a[i];
             }
            else if(a[i]==max){
                count=count+1;
            }
        }System.out.println(count+1);
    }
}
