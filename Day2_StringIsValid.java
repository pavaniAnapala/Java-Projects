package src;

/*Sherlock considers a string, ,
 to be valid if either of the following conditions are satisfied:

All characters in  have the same exact frequency (i.e., occur the same number of times).
 For example,  is valid, but  is not valid.
Deleting exactly  character from  will result in all its characters having the same frequency. 
For example,  and  are valid because all their letters will have the same frequency if we remove  occurrence of c, but  is not valid because we'd need to remove  characters.
Given , can you determine if it's valid or not? If it's valid, print YES on a new line; otherwise, print NO instead.*/

import java.util.*;

public class Day2_StringIsValid {
	
	static String isValid(String s){
        HashMap<Character,Integer> map = new HashMap(26);
        for(Character c : s.toCharArray())
        {
            if(map.containsKey(c))
            {
                int val = map.get(c);
                map.put(c,++val);
            }
            else
            {
                map.put(c,1);
            }
        }
        int min = Collections.min(map.values());
        int max = Collections.max(map.values());
        HashMap<Integer,Integer> intMap = new HashMap();
        for(int count : map.values())
        {
           Integer val = intMap.get(count);
            if(null != val)
                {
                intMap.put(count,++val);
            }
            else
                {
                intMap.put(count,1);
            }
        }

        String output= intMap.size() == 1  ||( intMap.size() <= 2 && (intMap.get(min) <= 1 || intMap.get(max) <= 1)) ? "YES" : "NO";
        return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String st = scan.next();
		String result = isValid(st);
		System.out.println(result);
		scan.close();
	}

}
