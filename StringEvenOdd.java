package HackerRankPrograms;
import java.util.*;
public class StringEvenOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i= scan.nextInt();
		String[] st = new String[i];
		String strEven, strOdd;
		for(int j=0;j<i;j++){
			//get the i number of Strings
			st[j]= scan.next();
					
		}
		System.out.println(st.length);
		//Process each string one by one, in each string get the Odd and even characters 
		//and copy them to seperate string, finally before proceeding for other String, print the 
		//even and odd characters in the string seperated with two spaces in the same line.
		for(int p=0;p<st.length;p++){
			//Each time make EvenOdd strings as empty before proceeding to next string
			strEven="";
			strOdd="";
			for(int q=0;q< st[p].length();q++){
				if((q==0) | (q%2 ==0 )){
				strEven= strEven + st[p].charAt(q);}
				else{
					strOdd = strOdd +st[p].charAt(q);
				}
				
			}
		System.out.println(strEven+"  "+strOdd);
			}
		
		scan.close();
	}
	
}
		/*st= st.replaceAll(" ", "");
		System.out.println(st);
		st=st.toUpperCase();
		System.out.println(st);
		char[] ch= st.toCharArray();
		String s1,s2;
		System.out.println(ch);
		System.out.println("lenght of charatcer array is..:"+ch.length);
		System.out.println((int)ch[1]);
		System.out.println((char)90);
		System.out.println(st.charAt(1));
	System.out.println((int)st.charAt(1)== 65);
	if(st.indexOf((char)65)==-1)
	{
		System.out.println("CHaracter found");
	}
	//System.out.println()
		//System.out.println(st.)
		//for(int i=65;i<91;i++){
			
		//}
	/*	{
			if(i%2 ==0){
				str
			}
			System.out.println(ch[i]);*/
		

