package honePot;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PalendromTest {

	public static String is_Palindrome(String s) {

		
		Map <Character, Integer> charsMap = new HashMap<>();
		
		//intialize the map.
		for(int i = 0 ; i < s.length() ; i++){
			if(charsMap.get(s.charAt(i)) == null){
				charsMap.put(s.charAt(i), 1);
			}else{
				charsMap.put(s.charAt(i), charsMap.get(s.charAt(i))+1);
			}
		}
		int oddCounter =0;
		//count the number of odd values
		for(Entry<Character, Integer> entry: charsMap.entrySet()){
			if(entry.getValue()%2 != 0){//means it is odd number 
				oddCounter++;
			}
		}
		
		if(oddCounter>1){
			return "NO";
		}else{
			return "YES";
		}
		
	
    }
	
	
	public static void main (String [] args){
		System.out.println(is_Palindrome(""));
	}
}
