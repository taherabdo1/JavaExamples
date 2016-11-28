package honePot;

public class StringCompression {

	static String compress(String str) {

		StringBuilder resultStringBuilder = new StringBuilder(1024);

		// validate the input
		if (str.length() > 1024) {
			return "invalid input length";
		}

		int currentCharCount = 1; // to hold the currnet character occurence to
									// this index.
		char c = str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				currentCharCount++;
			} else {
				if(currentCharCount == 1)
					resultStringBuilder.append(c + "");
				else
					resultStringBuilder.append(c + "" + currentCharCount);
				c = str.charAt(i);
				currentCharCount = 1;
			}
		}

		//handle the last round
		if(resultStringBuilder.toString().charAt(resultStringBuilder.toString().length()-2) != str.charAt(str.length()-1)){
			if(currentCharCount == 1)
				resultStringBuilder.append(c + "");
			else{
				resultStringBuilder.append(c + "" + currentCharCount);
			}
			
		}
		return resultStringBuilder.toString();

	}

	public static void main(String[] args) {
		System.out.println(compress("aaaaabbbbbbbbbccccde"));
	}
}
