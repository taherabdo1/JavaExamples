package toptal.codility;

public class InfiniteChessBoardWithAKnight {

	// recurseCount to handle circular calls
	public static int solution(int x, int y, int recurseCount) {

		int result = 0;
		// the very basic case
		if (x == 0 && y == 0)
			return 0;
		if ((x == 2 && y == 2) || (x == 1 && y == 1))
			return 4;
		if ((x == 1 && y == 0) || (x == 0 && y == 1))
			return 3;

		// the vertical and the horizontal cases with one value (0), x or y
		if (x == 0 || y == 0) {
			int temp = (x == 0 ? y : x);

			result = temp - (2 * (temp / 4));
			return result;
		}

		/// the diagonal case
		if (x == y) {
			result = 2 * ((x + 2) / 3);
			return result;
		}

		// if x + y is devidable by 3, if they are devidable by 3 and one of
		// them is less than 2 * the other, then the moves will equal the sum
		// over 3
		int biggerTemp = (x > y ? x : y); // to get the greater
		int smallerTemp = (x > y ? y : x); // to get the greater
		if ((x + y) % 3 == 0 && biggerTemp < 2 * smallerTemp) {
			return (x + y) / 3;
		}
		// if(recurseCount >= 10){
		// return Integer.MAX_VALUE;
		// }
		// the other cases
		if (y > x) {
			int result1 = 0;
			int result2 = 0;

			/*
			 * to cut the vertical axis
			 */

			// handle the circular call backs
			if (recurseCount >= 10) {
				result1 = Integer.MAX_VALUE;
			} else if (x % 2 != 0)
				result1 = Math.min(1 + solution(x - 1, y - 2, recurseCount++),
						x + solution(0, y - (2 * x), recurseCount++));
			else {
				result1 = Math.min((x / 2) + solution(0, y - (x / 2), recurseCount++),
						(2 * x > y) ? (y / 2 + solution(x - (y / 2), 0, recurseCount++))
								: x + solution(0, y - (2 * x), recurseCount++));
				if (y - (2 * x) == 1) // to handle if the calculation got to
										// point (0,1)
					result1 -= 2;
			}

			// to cut the diagonal
			// handle the circular call backs
			if (recurseCount >= 10) {
				result2 = Integer.MAX_VALUE;
			} else if ((y - x) % 3 == 0) {
				result2 = (y - x) / 3 + (solution(x + (2 * (y - x) / 3), x + (2 * (y - x) / 3), recurseCount++)); // x
																													// +
																													// ((y-x)
																													// /
																													// 3)
																													// this
																													// is
																													// the
																													// number
																													// of
																													// moves
																													// to
																													// get
																													// to
																													// the
																													// diagonal
			} else if ((y - x) % 3 == 1) {
				result2 = 1 + Math.min(solution(x - 1, y - 2, recurseCount++), solution(x + 2, y + 1, recurseCount++));
			} else if ((y - x) % 3 == 2) {
				result2 = 1 + Math.min(solution(x - 2, y - 1, recurseCount++), solution(x + 1, y + 2, recurseCount++));
			}
			result = Math.min(result1, result2);

		}

		/// handle the other diagonal side
		else if (y < x) {
			int result1 = 0;
			int result2 = 0;

			/*
			 * to cut the vertical axis
			 */

			// handle the circular call backs
			if (recurseCount >= 10) {
				result1 = Integer.MAX_VALUE;
			} else if (y % 2 != 0)
				result1 = Math.min(1 + solution(x - 2, y - 1, recurseCount++),
						y + solution(x - (2 * y), 0, recurseCount++));
			else {
				result1 = Math.min((y / 2) + solution(x - (y / 2), 0, recurseCount++),
						(2 * y > x) ? (x / 2 + solution(0, y - (x / 2), recurseCount++))
								: y + solution(x - (2 * y), 0, recurseCount++));// the
																				// first
																				// part
																				// of
																				// the
																				// ternary
																				// expression
																				// to
																				// handle
																				// the
																				// result
																				// of
																				// negative
																				// (x)
				if (x - (2 * y) == 1) // to handle if the calculation got to
										// point (0,1)
					result1 -= 2;
			}

			// to handle the diagonal direction check
			// handle the circular call backs
			if (recurseCount >= 10) {
				result2 = Integer.MAX_VALUE;
			} else if ((y - x) % 3 == 0) {
				result2 = ((x - y) / 3) + (solution(y + ((x - y) / 3), y + ((x - y) / 3), recurseCount++)); // y
																											// +
																											// ((x-y)
																											// /
																											// 3)
																											// this
																											// is
																											// the
																											// number
																											// of
																											// moves
																											// to
																											// get
																											// to
																											// the
																											// diagonal
			} else if ((x - y) % 3 == 1) {
				result2 = 1 + Math.min(solution(x - 2, y - 1, recurseCount++), solution(x + 1, y + 2, recurseCount++));
			} else if ((x - y) % 3 == 2) {
				result2 = 1 + Math.min(solution(x - 1, y - 2, recurseCount++), solution(x + 2, y + 1, recurseCount++));
			}

			result = Math.min(result1, result2);
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(solution(26, 18, 0));
	}
}
