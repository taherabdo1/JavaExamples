package hackerRank.selectedOnes;

import java.util.Scanner;

public class Candies {

	public int getCandiesCount() {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int result = 0;
		int[] input = new int[number];
		for (int i = 0; i < number; i++) {
			input[i] = in.nextInt();
		}
		result = 1;
		// go for the solution
		for (int i = 1; i < number; i++) {
			if (input[i] == input[i - 1]) {
				result++;
			} else if (input[i] > input[i - 1]) {
				result += 2;
			}
		}
		for (int i = number - 1; i > 0; i--) {
			if (input[i] == input[i - 1]) {
				continue;
			} else if (input[i] < input[i - 1]) {
				result += 1;
			}
		}
		return result;
	}
}
