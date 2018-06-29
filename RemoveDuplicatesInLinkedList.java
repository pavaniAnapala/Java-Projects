//Remove Duplicates in Linked List

package HackerRankPrograms;

import java.util.*;

class Node4{
    int data;
    Node4 next;
    Node4(int d){
        data =d;
        next =null;
    }
}
public class RemoveDuplicatesInLinkedList {
     public static void display(Node4 head){
        System.out.println("Printed one");
        Node4 start =head;
        while(start!=null){
            System.out.print(start.data+" ");
            start= start.next;
        }System.out.println();
        
       System.out.println();
    }
     public static Node4 removeDuplicatesUnSoretedList(Node4 head){
       Node4 start =head;
       int a[] = new int[10];
       int index = 0;
       int duplicate =0;
        while(start.next!=null){
            if(index ==0){
            a[index] = start.data;
            index++;
            start = start.next;
            }
            else{
                
         //Before copying the next element of the list to the arrya,
         //check if the element already presents in the array. If present do not copy else copy
         for(int i=0;i<a.length;i++){
             if(a[i]== start.data){
                 duplicate++;
                 }
           }
         if(duplicate >0){
             start.next =start.next.next;
         }
         else{
             a[index]=start.data;
             start =start.next;
         }
      }
  } //end of copy the unique elements to array.
        
        //Now compare each element in the 
       // System.out.println();
         return head;
     }
    public static Node4 removeDuplicates(Node4 head){
     
     Node4 start =head;
     if(start==null){
         return null;
     }
     while(start.next != null){
        if(start.data == start.next.data){
            start.next =start.next.next;
        } 
        else{
            start =start.next;
        }
        
     }
       return head;
    }
    public static Node4 insert(Node4 head, int data){
       Node4 p =new Node4(data);
       if(head == null){
           head= p; //new node , insert and mark next as null
         }
       else if(head.next == null){
           head.next = p; //insert second node. ie., next to start
           
       }
       else{
           //traverse till last and insert the node
           Node4 start = head;
           while(start.next!=null){
               start = start.next;
            }
           start.next =p;
      }
        return head;
    }
    
   
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        Node4 head =null;
        while(T-->0){
            int ele = scan.nextInt();
            head = insert(head, ele);
        }
        display(head);
        
     //   head = removeDuplicates(head);
        head = removeDuplicatesUnSoretedList(head);
        display(head);
        
    }
}
