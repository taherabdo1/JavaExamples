package toptal.codility.second_try;

public class TaskTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(5, 8));
	}

	public static int solution(int M, int N) {

		if(N == M)
			return N;
		if (N - M == 1) {
			return getXORBIT(M, N);
		}
		return getXORBIT(solution(M, M + ((N - M) / 2)), solution(M + ((N - M) / 2) + 1, N));

	}

	private static int getXORBIT(int x, int y) {
		return x ^ y;
	}

}
