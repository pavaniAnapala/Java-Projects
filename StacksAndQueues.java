
package HackerRankPrograms;
import java.util.*;
public class StacksAndQueues {
    LinkedList list1 = new LinkedList();
   LinkedList list2 = new LinkedList();
    
   void pushCharacter(char c){
     list2.push(c);
   }
   void enqueueCharacter(char c){
      list1.addLast(c);
   }
   char popCharacter(){
    return (char) list2.pop();
   }
   char deQueueCharacter(){
        return (char) list1.remove(0);
   }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        
        //Convert input string to an array of characters
        char[] s = input.toCharArray();
        
        //create a StacksAndQueues object
        StacksAndQueues p= new StacksAndQueues();
        
        //Enqueue /push all characters to their respective data structures
        for(char c: s){
            p.pushCharacter (c);
            p.enqueueCharacter(c);
        }
        
        //pop /Dequeue the characters at the end of both data structures and compare them:
        
        boolean isPalindrome = true;
        for(int i=0;i<s.length /2 ;i++){
            if(p.popCharacter() != p.deQueueCharacter()){
                isPalindrome = false;
                break;
            }
        }
        System.out.println("the word "+ input +", is "+ ((! isPalindrome  )? "not a palindrome": "a palindrome" ));
    }

   
}
