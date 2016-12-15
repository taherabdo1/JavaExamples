package cliqz;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TaskTwo {

	public static int solution(int K, int[] A) {
		int result = 0;

		Map<Integer, Integer> numberAndItsRepeats = new HashMap<>();

		// initialize the map
		for (int i = 0; i < A.length; i++) {
			// if not found before add it with repeats of (1)
			if (numberAndItsRepeats.get(A[i]) == null) {
				numberAndItsRepeats.put(A[i], 1);
			}
			// if found before increament the repeats by (1)
			else {
				numberAndItsRepeats
						.put(A[i], numberAndItsRepeats.get(A[i]) + 1);
			}
		}

		int minCount = -1; // this is the max number of a certain pairs can get
							// (2,2,4,4,4) will return only 2 pairs
		
		
		// now test the map
		for (Entry<Integer, Integer> entry : numberAndItsRepeats.entrySet()) {
			if (numberAndItsRepeats.get(K - entry.getKey()) != null
					&& entry.getValue() > 0) {
				minCount = Math.max(
						numberAndItsRepeats.get(K - entry.getKey()),
						entry.getValue());
				if(entry.getKey() == K/2)
					result += minCount;
				else{
					result += (minCount*2);					
				}
				// re-put the values to be zeros to ignore them.
				numberAndItsRepeats.put(entry.getKey(), entry.getValue()-minCount);
				numberAndItsRepeats.put(K - entry.getKey(), numberAndItsRepeats.get(K - entry.getKey()) - minCount);
			}

		}

		return result;
	}

	public static void main(String[] args) {

		int[] testArray = {1,8,-3,0,1,3,-2,4,5};
		int[] testArray2 = {1};

		System.out.println(solution(6, testArray));
	}
}
