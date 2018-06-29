package HackerRankPrograms;

import java.util.*;
import java.text.*;

public class pangramProgram {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		System.out.println("Entered String is..:"+st);
		st = st.toUpperCase();
		boolean p=false;
		st=st.replaceAll(" ","");
		System.out.println("value of st is ..."+st);
		if(st.length()<26){
			System.out.println("Not Pangram");
		}
		else{
		
		//char[] chs= st.toCharArray();
		//System.out.println(chs);
		
		//Set<Character> set1 = new HashSet<Character>();
		//System.out.println(set1);
		
		for(int i=65;i<=90;i++){
			if(st.indexOf(i) != -1)
			{
				p=true;
				
			}
			else{
				p=false;
				System.out.println(i);
				break;
			}
				
		}
		System.out.println((p==true) ? "Pangram" : "Not Pangram");}
		
		
	//	System.out.println("set size is" +set1.size());
		//System.out.println(set1.size()==26 ? "Pangram" : "Not Pangram");
		
		}

	}

