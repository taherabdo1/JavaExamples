package hackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int k = in.nextInt();
		char temp = 0;
		int intTemp;
		k = k%26;
		String output = "";
		for (int i = 0; i < s.length(); i++) {
			if (((((Character) s.charAt(i)) >= 65) && (((Character) s.charAt(i)) <= 90))) {
				intTemp = (s.charAt(i) + k);
				// temp = (char) (s.charAt(i)+k);
				if (intTemp > 90) {
					temp = (char) (64 + intTemp - 90);
				} else
					temp = (char) intTemp;
				// temp = 'A';
			} else if (((((Character) s.charAt(i)) >= 97) && (((Character) s.charAt(i)) <= 122))) {
				intTemp = (s.charAt(i) + k);
				// temp = (char) (s.charAt(i)+k);
				if (intTemp > 122) {
					temp = (char) (96 + intTemp - 122);
				} else
					temp = (char) intTemp;

			} else {
				temp = s.charAt(i);
			}
			output += temp;

		}
		System.out.println(output);
	}
}
