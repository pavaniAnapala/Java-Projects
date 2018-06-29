
package HackerRankPrograms;
import java.util.*;
/**
 *
 * @author Asus

 */
class Node1{
    Node1 left, right;
    int data;
    Node1(int data){
        this.data= data;
        left=right=null;
    }
}
public class BinarySearchTreeLenght {
    public static int getHeight(Node1 root){
       if(root==null){
           return -1;
       }
       int left = 1 + getHeight(root.left);
       int right = 1 + getHeight(root.right);
        return Math.max(left, right);
    }
    public static Node1 insert(Node1 root, int data){
        if(root==null){
            return new Node1(data);
        }
        else{
            Node1 cur;
            if(data<root.data){
                cur= insert(root.left,data);
                root.left =cur;
            }
        
             else{
                      cur=insert(root.right,data);
                      root.right=cur;
                      }    
      
       // return root;
    return root;
    }
    }
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    Node1 root=null;
    while(T-->0){
        int data = scan.nextInt();
        root = insert(root, data);
    }
    int height =getHeight(root);
    System.out.println(height);
   
}
}
