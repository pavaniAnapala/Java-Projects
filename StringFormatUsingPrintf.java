
package HackerRankPrograms;
import java.util.*;
public class StringFormatUsingPrintf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s = new Scanner(System.in);	
	System.out.println("*********************");
	for(int i=0;i<=3;i++)
	{
		String s1= s.next();
		int x= s.nextInt();
		System.out.format("%-15s%03d",s1,x);
		
	}s.close();
	System.out.println("*********************");
	
	}

}
