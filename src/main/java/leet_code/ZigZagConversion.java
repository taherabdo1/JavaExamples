package leet_code;

public class ZigZagConversion {

	public static String convert(String s, int numRows) {

		char[] charResult = new char[s.length()];

		if(s.length() < numRows || numRows == 1){
			return s;
		}
		charResult[0] = s.charAt(0);
		int temp1 = 2*numRows-4, temp2 = 2;
		int currentRow = 1;
		int i = 1; // for the output parsing
		// get the first level
		for (int k = (numRows * 2) - 2; k < s.length(); k += ((numRows * 2) - 2)) {
			charResult[i] = s.charAt(k);
			i++;
		}

		// the other rows
		for (; currentRow < numRows && temp1 > 0; currentRow++) {
			charResult[i] = s.charAt(currentRow);
			i++;
			// get the other levels
			for (int k = currentRow; k + temp1 < s.length();) {

				charResult[i] = s.charAt(k + temp1);
				k += temp1;
				i++;
				if (k + temp2 < s.length()) {
					charResult[i] = s.charAt(k + temp2);
					i++;
					k += temp2;
				}else{
					break;
				}
			}
			temp1 -= 2;
			temp2 += 2;
		}
		// get the last level
		for (int k = numRows - 1; k < s.length(); k += ((numRows * 2) - 2)) {
			charResult[i] = s.charAt(k);
			i++;
		}

		return new String (charResult);
	}
	
	
	public static void main(String [] args){
		System.out.println(convert("PAYPALISHIRING", 4));
	}
}
