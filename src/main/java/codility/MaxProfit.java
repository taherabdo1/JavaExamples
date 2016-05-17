package codility;

public class MaxProfit {


	public int solution(int[] A) {
		int result = 0;
		int tempResult = 0;

		if (A.length == 0 || A.length == 1)
			return 0;
		for (int i = 1; i < A.length; i++) {
			tempResult = Math.max(0, tempResult + A[i] - A[i - 1]);
			result = Math.max(tempResult, result);
		}

		return result;
	}
}
