//Java lambda expressions example
//package src;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;

class Prime{
	public void checkPrime(int... p){
	    boolean prime;
	    for(int i=0;i<p.length;i++){
	        prime = true;
	        int n = (int)java.lang.Math.sqrt(p[i]);
	      if(p[i]>1)
	        	for(int j=2;j<n+1;j++){
	        		if(p[i]%j==0){
	        			prime = false;
	        			break;
	        		}
	        }
	        else prime = false;
	        if(prime) {
	               System.out.print(p[i]);
	                System.out.print(" ");
	            }
	    }
	    System.out.println();
	}
}

public class BufferReaderPrimeCheck{	
	public static void main(String[] args) {
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
	//	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));	
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4);
		ob.checkPrime(n1,n2,n3,n4,n5);	
		
		Method[] methods= Prime.class.getDeclaredMethods();
		
		Set<String> set=new HashSet<>();
		boolean overload=false;
		for(int i=0;i<methods.length;i++)
		{
			if(set.contains(methods[i].getName()))
			{
				overload=true;
				break;
			}
			set.add(methods[i].getName());
			
		}
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
		}
	}


	 
