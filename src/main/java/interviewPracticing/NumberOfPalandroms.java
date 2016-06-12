package interviewPracticing;

import java.util.HashSet;
import java.util.Set;

public class NumberOfPalandroms {

	public static void main(String[] args) {
		// System.out.println(palindromeTest("barbarabar"));
		System.out.println(stringReduction("cbcbabccaaaacbbbcccbbb"));
	}

	public static int palindromeTest(String string) {
		Set<String> palindromes = new HashSet<>();
		boolean canBePalindrome;
		for (int i = 0; i < string.length(); i++) {
			int offset = 0;
			canBePalindrome = true;
			while (i - offset >= 0 && i + offset < string.length() && canBePalindrome) {
				if (string.charAt(i - offset) == string.charAt(i + offset)) {
					palindromes.add(string.substring(i - offset, i + offset + 1));
					offset++;
				} else {
					canBePalindrome = false;
				}
			}
		}
		return palindromes.size();
	}

		static int stringReduction(String a) {
	
			StringBuffer sb = new StringBuffer();
			int i = 0;
			boolean flag = false;
			for (; i < a.length() - 1; i++) {
				if (a.charAt(i) != a.charAt(i + 1)) {
					sb.append(getThird(a.charAt(i), a.charAt(i + 1)));
					flag = true;
					break;
				} else
					sb.append(a.charAt(i));
			}
			//if the length of the string is one
			if(a.length() == 1)
				sb.append(a.charAt(i));

			//handle if the last two elements are identical
			else if(i == a.length()-1 && a.charAt(i) == a.charAt(i-1))
				sb.append(a.charAt(i));
			//if break before the end of the string
			if (i < a.length()-2)
				sb.append(a.substring(i + 2));
	
			if (!flag)
				return sb.length();
			else
				return stringReduction(sb.toString());
	
		}
	
		//to get the third element of a different two adjacent elements
		static char getThird(char a, char b) {
			if ((a == 'a' && b == 'b') || (a=='b' && b == 'a'))
				return 'c';
			else if ((a == 'a' && b == 'c')||(a == 'c' && b == 'a'))
				return 'b';
			else
				return 'a';
		}
}
