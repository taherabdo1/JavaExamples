package codility;

public class CountFactors {

	public int solution(int input) {
		int result = 0;

		if (input == 1)
			return 1;
		else if (input == 2 || input == 3)
			return 2;

		int i = 1;

		for (; i * i < input; i++) {
			if (input % i == 0) {
				result += 2;
			}
		}
		if (input == i * i) {
			result += 1;
		}

		return result;
	}
}
