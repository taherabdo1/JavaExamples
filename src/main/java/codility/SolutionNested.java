package codility;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//this is a solution for properly nested ({[)}] char as a test from codility examples lesson 7 (queues and stacks)
public class SolutionNested {

	char[] open = { '(', '{', '[' };
	Map<Character, Character> pairs = new HashMap<>();
	Stack<Character> charsStack = new Stack<>();

	public int isProperlyNested(String S) {
		// initialize the map
		pairs.put('(', ')');
		pairs.put('{', '}');
		pairs.put('[', ']');

		// if the string is empty
		if (S.length() == 0) {
			return 1;
		}
		if (!contains(open, S.charAt(0))) {
			return 0;
		}
		charsStack.push(S.charAt(0));
		for (int i = 1; i < S.length(); i++) {
			char temp;
			if (contains(open, temp = S.charAt(i))) {
				charsStack.push(temp);
			} else if (!charsStack.isEmpty()) {
				if (pairs.get(charsStack.pop()) == (S.charAt(i))) {
					continue;
				} else {
					return 0;
				}
			}else if (charsStack.isEmpty() && !contains(open, S.charAt(i))){
				return 0;
			}

		}
		if(charsStack.isEmpty())
			return 1;
		return 
				0;
	}

	private boolean contains(char[] arr, char c) {
		for (Character ch : arr) {
			if (c == ch)
				return true;
		}
		return false;
	}
}
