package src;
import java.util.*;
import java.lang.*;
//import java.lang.String;
public class String_Len_Java {
	public static void main(String args[]){
		Scanner st = new Scanner(System.in);
		String A =st.next();
		String B = st.next();
		System.out.println();
		st.close();
		System.out.println(A.length()+ B.length());
				
		if(A.compareToIgnoreCase(B)>0)
		{
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		
		System.out.println(A.substring(0,1).toUpperCase()+ A.substring(1)+ " "+ B.substring(0,1).toUpperCase()+B.substring(1));
		
	}

}

