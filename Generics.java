

package HackerRankPrograms;
import java.util.*;
import java.math.*;
class Printer<T>{
  public static<T> void printArray(T[] a){
    //  ways to print array
  /*  for(int i=0;i<a.length;i++){
        T item = a[i];
        System.out.print(item+ " ");
    }
    System.out.println();
   } */
  for(T item: a){
      System.out.print(item+" ");
  }System.out.println();
}
}
public class Generics {
    public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int n= scan.nextInt();
//get Integer array
Integer[] a= new Integer[n];
for(int i=0;i<n;i++){
   a[i]= scan.nextInt();
     }

int p= scan.nextInt();
String[] st=new String[p];
System.out.println("ENtered NUmber is"+p);
for(int j=0;j<p;j++)
    {
    st[j]=scan.next();
    }
    //INSTANTIATE THE GENERIC CLASS
Printer<Integer> intPrinter = new Printer<Integer>();
Printer<String> stPrinter = new Printer<String>();
//call the generic methods from that class

intPrinter.printArray(a);
stPrinter.printArray(st);
if(Printer.class.getDeclaredMethods().length>1){
    System.out.println("Generic class Printer should have only one method as per requirement");
}
    
   }
}

