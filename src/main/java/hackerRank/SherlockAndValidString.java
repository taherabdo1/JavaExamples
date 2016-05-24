package hackerRank;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SherlockAndValidString {

	public static String solution() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		Map<Character, BigInteger> temp = new HashMap<Character, BigInteger>();

		
		for (int i = 0; i < input.length(); i++) {
			if(temp.get(input.charAt(i)) != null){
				temp.put(input.charAt(i), (temp.get(input.charAt(i)).add(new BigInteger("1"))));				
			}
			else{
				temp.put(input.charAt(i), new BigInteger("1"));			
			}
		}

		BigInteger value =temp.get(input.charAt(0));
		
		for (Entry<Character , BigInteger> e : temp.entrySet()) {
			if(!(e.getValue().equals(value))){
				return("NO");
			}
			else{
				continue;
			}
		}

		return("YES");

	}
	
	
}
