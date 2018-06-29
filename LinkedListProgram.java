
package HackerRankPrograms;
import java.util.*;
import java.io.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data =d;
        next = null;
    }
}

public class LinkedListProgram {
    public static Node insert(Node head, int data){
        /*This will handle cases where the head node is empty.
// Which is just an edge case.*/
    if(head == null){
        return new Node(data);
    }
    /*This is actual recursion. 
// We check if the node's next is empty 
// i.e. the node is the last node or the tail of the LL
// and if so, add the new node as to it's next. 
// This is the base case for recurison in the else clause*/
    
    if(head.next == null){
        head.next = new Node(data);
    }
    else{
        insert(head.next, data);
    }
    return head;
    }
    public static void display(Node head){
        Node start =head;
        while(start!= null){
            System.out.print(start.data+" ");
            start = start.next;
        }
      }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Node head =null;
        int N=sc.nextInt();
        
        while(N-->0){
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
