
package HackerRankPrograms;
import java.util.*;

public class MapAndDictionariesDemo {
   public static void main(String args[]){
       Map<String,Integer> dict = new HashMap<String, Integer>();
       Scanner scan=new Scanner(System.in);
       int n = scan.nextInt();
       String name;
       int phone;
       for(int i=0;i<n;i++)
       {
         name= scan.next();
         phone=scan.nextInt();
         dict.put(name, phone);
       }
      System.out.println(dict.values());
      while(scan.hasNext()){
			String s= scan.next();
                        if(dict.get(s)!=null){
			System.out.println(s +"="+ dict.get(s));
                        }
                        else{
                            System.out.println("Not found");
                        }
		}
   } 
}
