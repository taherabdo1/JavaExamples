package interviewPracticing;

import java.util.ArrayList;
import java.util.List;

public class StringCompression {

	public String solution(String input) {
		StringBuffer result = new StringBuffer();
		int count = 1;

		//handle whole the string except the last element
		for (int i = 1; i < input.length() - 1; i++) {
			if (input.charAt(i) == input.charAt(i - 1)) {
				count++;
			} else {
				result.append(input.charAt(i - 1) + "" + count);
				count = 1;
			}
		}
		
		// handle the last character
		if (input.charAt(input.length() - 1) == input.charAt(input.length() - 2)) {
			result.append(input.charAt(input.length() - 1) + "" + (count + 1));
		} else {
			result.append(input.charAt(input.length() - 1) + ("1"));
		}
		
		// if the result is longer than the input return input
		if (result.length() > input.length()) {
			return input;
		}
		return result.toString();
	}
}
