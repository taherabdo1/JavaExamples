package hackerRank.hourrank_7;

import java.util.Scanner;

import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;

public class App {
	int result = 0;

	public static void main(String[] args) {

	}

	static void nikitaGame() {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int counter = 0;
		// int result = 0;
		while (counter < T) {
			int N = in.nextInt();
			int[] input = new int[N];
			int[] acc = new int[N];
			counter++;
			// get input
			for (int i = 0; i < N; i++) {
				input[i] = in.nextInt();
			}
			System.out.println(getResult(input));
		}
	}

	static int getResult(int[] input) {
		int result = 0;
		if (input.length == 2) {
			if (input[0] == input[1])
				return 1;
		} else if (input.length == 1) {
			return 0;
		} else {
			int[] firstPart;
			int[] secondPart;
			// process input
			int[] acc = new int[input.length];
			int N = input.length;

			// acc sum
			acc[N - 1] = input[N - 1];
			for (int i = N - 2; i >= 0; i--) {
				acc[i] = input[i] + acc[i + 1];
			}
			int accTemp = input[0];
			// get the first equal parts
			for (int i = 1; i < N; i++) {
				if (acc[i] == accTemp) {
					result++;
					firstPart = new int[i];
					secondPart = new int[input.length - i];
					System.arraycopy(input, 0, firstPart, 0, firstPart.length);
					System.arraycopy(input, firstPart.length, secondPart, 0,
							secondPart.length);
					return getResult(firstPart) > getResult(secondPart) ? result
							+ getResult(firstPart)
							: getResult(secondPart) + result;
				}
				accTemp += input[i];

			}
		}
		return 0;
	}

	static void paintTheTiles() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String C = in.next();
		int result = 1;
		for (int i = 1; i < N; i++) {
			if (C.charAt(i) != C.charAt(i - 1))
				result += 1;
		}
		System.out.println(result);
	}
}