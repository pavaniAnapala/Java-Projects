


/*For each line, print the line number, followed by a single space,
 *  and then the line content received as input.
 */

/*
Sample Input

Hello world
I am a file
Read me until end-of-file.

Sample Output

1 Hello world
2 I am a file
3 Read me until end-of-file.*/


package HackerRankPrograms;
import java.util.*;


public class EndOfLineProgram {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		for(int i=1;sc.hasNext()==true;i++){
			System.out.println(i+" "+sc.nextLine());
		}

	}

}
