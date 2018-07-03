package StringPrograms;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.lang.String;
public class StringAnagram {
	public static boolean isAnagram(String a, String b){
		if(a ==null || b==null || a==""|| b=="")
		{
			throw new IllegalArgumentException();
		}
		if(a.length() != b.length()){
			return false;
		}
		
		a= a.toLowerCase();
		b= b.toLowerCase();
	int[] temp = new int[Character.MAX_VALUE];
	//System.out.println(temp);
	 
	int sum =0;
		for(int i=0;i<a.length();i++)
		{
			sum += ++temp[a.charAt(i)] <=0 ?-1 :1;
			sum += --temp[b.charAt(i)] >=0 ? -1: 1;
		}
		return sum==0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b= scan.next();
		scan.close();
		boolean ret = isAnagram(a,b);
		System.out.println((ret)? "Anagrams" : "Not Anagrams");
	}

}
