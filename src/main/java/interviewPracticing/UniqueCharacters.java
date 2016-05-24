package interviewPracticing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author abdelmoh
 *this class has a method to check if the input string contains only unique caharacters
 */
public class UniqueCharacters {

	
	public boolean solution(String input){
		boolean result = true;
		Set<Character> chars = new HashSet<>();
		chars.add(input.charAt(0));

		for(int i = 1 ; i < input.length() ; i++){
			if((chars.contains(input.charAt(i))) == true){
				result = false;
				break;
			}
			chars.add(input.charAt(i));
		}
		return result;
	}
}
