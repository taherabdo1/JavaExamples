package codility;

import java.util.Stack;

public class EquiLeader {

	public int solution(int[] A) {
		int[] temp = new int[A.length];
		int[] leaderOccurance = getLeader(A);
		int numberOfLeaderOccuranceAcc = 0;
		int result = 0;
		// special cases
		if (A.length == 0 || A.length == 1 || (A.length == 2 && A[0] != A[1])) {
			return 0;
		}
		for (int i = 0; i < A.length; i++) {
			if (A[i] == leaderOccurance[0]) {
				numberOfLeaderOccuranceAcc++;
				if (((double) numberOfLeaderOccuranceAcc / (i + 1)) > .5)
					if (((double) (leaderOccurance[1] - numberOfLeaderOccuranceAcc) / (A.length - i - 1)) > 0.5)
						result++;
			}
		}
		return result;
	}

	private int[] getLeader(int[] input) {
		Stack<Integer> tempStack = new Stack<>();
		int numberOfLeaderOccurance = 0;
		int leader = -1;
		int[] resultArr = new int[2];
		resultArr[0] = -1;
		resultArr[1] = 0;
		tempStack.push(input[0]);
		// stack work
		for (int i = 1; i < input.length; i++) {
			if (!tempStack.empty() && tempStack.peek() != (input)[i]) {
				tempStack.pop();
				numberOfLeaderOccurance++;
			} else if (!tempStack.empty() && tempStack.peek() == (input)[i]) {
				tempStack.push(input[i]);
			} else if (tempStack.isEmpty()) {
				tempStack.push(input[i]);
			}
		}
		// get leader
		if (!tempStack.isEmpty()) {
			leader = tempStack.peek();
			// get the number of leader occuarance over the half
			while (!tempStack.isEmpty()) {
				if (tempStack.pop() == leader)
					numberOfLeaderOccurance++;
			}

			resultArr[0] = leader;
			resultArr[1] = numberOfLeaderOccurance;
			return resultArr;
		} else
			return resultArr;
	}
}
