package interviewPracticing;

public class Stringpermutation {

	public boolean isPermutations(String str1, String str2) {
		boolean result = true;
		if (str1.length() != str2.length())
			return false;

		int[] chars1 = new int[52];
		int[] chars2 = new int[52];
		for (int i = 0; i < str1.length(); i++) {
			chars1[str1.charAt(i) - 'a']++;
			chars2[str2.charAt(i) - 'a']++;
		}
		for (int i = 0; i < chars1.length; i++) {
			if (chars1[i] != chars2[i]) {
				result = false;
				return result;
			}
		}
		return result;
	}
}
