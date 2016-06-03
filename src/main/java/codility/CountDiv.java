package codility;

public class CountDiv {

	public int solution(int A, int B, int K) {
		int result = 1;

		int temp = 0;
		if (A % K != 0) {
			temp = A + (K - (A % K));
		}else{
			temp = A;
		}
		result += (B / K) - (temp / K);
		return result;
	}
}
