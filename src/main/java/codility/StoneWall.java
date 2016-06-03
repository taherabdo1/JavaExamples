package codility;

import java.util.Stack;

public class StoneWall {

	public static void main(String[] args) {
		 int[] H = { 1, 2, 2, 1, 8, 5 ,8};
//		int[] H = { 2, 5, 1, 4, 6, 7, 9, 10, 1 };
		System.out.println(solution(H));
	}

	public static int solution(int[] H) {
		int result = 0;
		Stack<Integer> values = new Stack<>();

		for (int i = 0; i < H.length; i++) {
			// the rectangle follows
			if (values.size() != 0 && H[i] == values.peek()) {
				continue;
			}
			// new step is being taken high
			else if (values.size() != 0 && H[i] > values.peek()) {
				values.push(H[i]);
			}
			// one step down
			else if (values.size() != 0 && H[i] < values.peek()) {
				while (values.size() != 0 && values.peek() > H[i]) {
					values.pop();
					result++;
				}
				if (values.size() == 0 || (values.size() != 0 && H[i] != values.peek()))
					values.push(H[i]);
			}

			else if (values.size() == 0) {
				values.push(H[i]);
			}
		}
		if (values.size() != 0) {
			result += values.size();
		}
		return result;
	}

}
