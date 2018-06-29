package CodeFighters;
import java.util.*;
public class FirstNonRepeatingChar {
	public static char firstChar(String st){
		String first="" ;
		//char[] letters = new char[st.length()];
		for(int i=0;i<st.length();i++){
			if(first.indexOf(st.charAt(i))<0){
				first=first+st.charAt(i);
			}
			else{
				return (st.charAt(i) );
			}
		}return 'x';
				
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String mystr="Hi this is pavani";
		System.out.println("First Repeated char is "+ firstChar(mystr));
				
		scan.close();

	}

}
