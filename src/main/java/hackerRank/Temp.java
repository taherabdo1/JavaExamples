package hackerRank;

import java.util.HashSet;
import java.util.Set;

public class Temp {

	public static void main(String[] args){
		String name = "taher";
		System.out.println(name.substring(0, 2));
		System.out.println(name.charAt(2));
		System.out.println(name.substring(2));
	}
	static int solution(int[] A, int[] B, int M, int X, int Y) {
		int trans = 0;
		int index = 0;
		int transCount = 0;
		int personInTrans = 0;
		int tot = 0;
		Set<Integer> subs = new HashSet<>();
		while (index < A.length) {

		trans += A[index];
		personInTrans++;

		if (A[index] > Y) {
		index++;
		continue;
		}

		if (A[index] == Y) {
		index++;
		tot++;
		transCount++;
		continue;
		}

		if (trans <= Y && personInTrans <= X) {
		subs.add(B[index]);
		index++;

		}
		if ((!(trans <= Y && personInTrans <= X)) || index == A.length) {

		tot += subs.size();
		// k=index;
		trans = 0;
		personInTrans = 0;
		transCount++;
		}

		}

		return transCount + tot/*
		* + distinct values count of each transition
		*/;
		}
}
