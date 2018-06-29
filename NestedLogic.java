
/*The first line contains 
space-separated integers denoting the respective , and 
on which the book was actually returned. 
The second line contains space-separated integers denoting the respective 
, and on which the book was expected to be returned (due date).*/

package HackerRankPrograms;
import java.util.*;

public class NestedLogic {
    public static int calcuateFine(int[] returnDate,int[] expectedDate){
      int fine=0;
      //Diferrent year, return 10000
      if(returnDate[2] < expectedDate[2]){
          return 10000;
      }
      //different month same year, return 500*No.of months different
      if((returnDate[1] < expectedDate[1])&(returnDate[2] == expectedDate[2])) {
          
          return (500*(expectedDate[1]- returnDate[1]));
      }
       //different date, same month same year, return 15*No.of monts days different
      if((returnDate[0] < expectedDate[0])& ((returnDate[1] == expectedDate[1])&(returnDate[2] == expectedDate[2]))) {
          return (15*(expectedDate[0]- returnDate[0]));
      } 
      if(returnDate == expectedDate){
      
          return fine;
    }
      return fine;
        
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int[] returnDate= new int[3];
        int[] expectedDate = new int[3];
        for(int j=0;j<returnDate.length;j++){
              returnDate[j] = scan.nextInt();
        }
        System.out.println();
        for(int k=0;k<expectedDate.length;k++){
            expectedDate[k]=scan.nextInt();
        }
        scan.close();
      /*  if((returnDate[0] | expectedDate[0]) >31)throw new Exception("Date cannot be above  31");
         if((returnDate[1] | expectedDate[1]) >12)throw new Exception("Month cannot be above 12");
          if((returnDate[0] | expectedDate[0]) <3000)throw new Exception("Year cannot be below 3000");*/
          
          System.out.println();
                
           for(int j=0;j<returnDate.length;j++){
              System.out.print(returnDate[j]+" ");
        }
           System.out.println();
          for(int j=0;j<expectedDate.length;j++){
              System.out.print(expectedDate[j]+" ");
        }
          System.out.println(calcuateFine(returnDate,expectedDate));
          
    }
}
