package zalando;

import java.util.HashMap;
import java.util.Map;

public class OnlineExam {

	// get the longest valid substring
	public int solution1(String S) {
		int result = -1;
		boolean containsUppperCase = false;
		int begin = 0;
		int end = 0;
		for (int i = 0; i < S.length(); i++) {
			// if the current char is upper case char
			if (Character.isUpperCase(S.charAt(i))) {
				containsUppperCase = true;
				end = i + 1;
			} else if (Character.isAlphabetic(S.charAt(i))) {
				end++;
			}
			// if the current is not valid
			if (Character.isDigit(S.charAt(i))) {
				if (containsUppperCase)
					result = Math.max(result, end - begin);
				begin = i + 1;
				end = i + 1;
				containsUppperCase = false;
			}
		}
		if (containsUppperCase)
			result = Math.max(result, end - begin);

		return result;
	}

	// task 2
	int solution(int[] A) {
		int N = A.length;
		int result = 0;
		// the key is the actual value in the array and the value is the index
		// of the element in the array
		Map<Integer, Integer> integerMap = new HashMap<>();

		for (int i = 0; i < N; i++) {
			if (integerMap.containsKey(A[i])) {
				result = Math.max(result, Math.abs(i - integerMap.get(A[i])));
			}
			// if not found n the map
			else {
				integerMap.put(A[i], i);
			}
		}

		return result;
	}

	// task 3
	public int solution3(int[] A) {
		int result = 0;
		int start = 0;
		int end = 0;
		int barier = -1;
		for (int i = 0; i < A.length -1; i++) {
			// if the barrier deosn't set yet
			if (barier == -1) {
				if (A[i] > A[i+1]) {
					start = i;
					end = i;
					barier = A[i];
					continue;
				}
			}
			// if the barier is set
			else if (A[i] < barier) {
				end++;
			}
			//if the current element is less than the comming one
			else{
				result = Math.max(result, end - start+1);
			}
		}
		return result;

	}
	
	public int solution32(int[] A) {
		int result = 0;
		int start = 0;
		int end = 0;
		int upperBarier = -1;
		int lowerBarrier = Integer.MAX_VALUE;
		for (int i = 0; i < A.length; i++) {
			// if the barrier deosn't set yet
			if (upperBarier == -1) {
				if (A[i] > A[i+1]) {
					start = i;
					end = i;
					upperBarier = A[i];
					continue;
				}
			}
			// if the barier is set
//			if(lowerBarrier != -1){
				//get the lower barrier
				if (A[i] < upperBarier) {
//					lowerBarrier = Math.min(lowerBarrier , A[i]);
					end = i;
				}
//			}
			//if the current element is less than the comming one
		}
		result = end - start+1;

		return result;

	}
		
	public int solution33(int[] A) {
		int result = 0;
		int start = 0;
		int end = 0;
		int upperBarier = -1;
		Map<Integer, Integer> firstOccurance = new HashMap<>();
		int lowerBarrier = Integer.MAX_VALUE;
		for (int i = 0; i < A.length; i++) {
			if(!firstOccurance.containsKey(A[i]))
				firstOccurance.put(A[i], i);
			// if the barrier deosn't set yet
			if (upperBarier == -1) {
				if (A[i] > A[i+1]) {
					start = i;
					end = i;
					upperBarier = A[i];
					continue;
				}
			}
			// if the barier is set
//			if(lowerBarrier != -1){
				//get the lower barrier
				if (A[i] < upperBarier) {
//					lowerBarrier = Math.min(lowerBarrier , A[i]);
					end = i;
				}
//			}
			//if the current element is less than the comming one
		}
		result = end - start+1;

		return result;

	}

}
