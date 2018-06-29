
package CodeChallenge;
import java.util.*;

public class CustomerDetails {
    public static void main(String[] args){
        Map<String, Integer> names = new HashMap<String, Integer>();
        
        Scanner scan =new Scanner(System.in);
        
        while (scan.hasNext()){
          String custId = scan.next();
            if (custId.equals("end")) {
            break;
            }
            
          int  orders = scan.nextInt();
          if(names.containsKey(custId)){
                orders = orders + names.get(custId);
            }
          names.put(custId, orders);
          }
        
           
        List<Integer> list = new ArrayList<Integer>(names.values());
        Collections.sort(list);
       Collections.reverse(list);
        list = list.subList(0, 10);
            
          //Traversing and getting top 10 customers  
        for(int i=0;i<list.size();i++){
          Iterator it = names.entrySet().iterator();
          while(it.hasNext()){
              Map.Entry<String, Integer> entry = (Map.Entry)it.next();
              if(entry.getValue()== list.get(i))
            System.out.println(entry.getKey()+" "+ entry.getValue());
              
          }
      }
      
      
            
      
       
      
    }
}
