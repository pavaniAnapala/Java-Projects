//also called as level order traversal 
package HackerRankPrograms;

import java.util.*;
class Node3{
    Node3 left, right;    
    int data;
    Node3(int data){
        this.data =data;
        left =right=null;
    }
}
public class BreadthFirstSearch {
    //Now traverse the Binary Search tree in level Order traversal
    //i.e, root ->level 1 all nodes from left to right 
//-->then level 2 all nodes from left to right and so on...
    static void levelOrder(Node3 root){
                   
       Queue<Node3> queue = new LinkedList();
       queue.add(root);
       
       while(!queue.isEmpty()){
           Node3 cur = queue.remove();
           System.out.print(cur.data + " ");
           if(cur.left!= null )queue.add(cur.left);
           if(cur.right != null) queue.add(cur.right);
       }
        }
        
     //inserting entered values into the Binary Search Tree
    //(ie., Node is greater than left and less than right node
    public static Node3 insert(Node3 root, int data){
        if(root==null){
            return new Node3(data);
        }
        else{
            Node3 cur;
            if(data<=root.data){
                cur =insert(root.left,data);
                root.left = cur;
            }
            else{
                cur = insert(root.right, data);
                root.right= cur;
            }
            return root;
        }
    }
public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n=scan.nextInt();
    Node3 root= null;
    while(n-->0){
        int data= scan.nextInt();
       root =  insert(root, data);
    }
    levelOrder(root);
}
}
