package HackerRankPrograms;
import java.util.*;


public class MapsAndDictionariesProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> dict = new HashMap<String,Integer>();
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("Enter name and phone");
			String name= scan.next();
			int phone = scan.nextInt();
	//		dict.put(name,phone);
		}while(scan.hasNext()){
			String s= scan.next();
		
	//		System.out.println(s +"="+ dict.get("s"));
		}
		
	scan.close();	
	}

}
