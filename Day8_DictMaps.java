package src;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Day8_DictMaps {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Map<String,Integer> dict = new HashMap<String,Integer>();
		for(int i=0;i<n;i++){
			String name =scan.next();
			int phone = scan.nextInt();
			
			dict.put(name, Integer.valueOf(phone));
			}
		while(scan.hasNext()){
			String s = scan.next();
			if(dict.containsKey(s)){
				System.out.println(s +"="+ dict.get(s));
			}else{
				System.out.println("Not found");
			}
			
		} scan.close();

	}

}
