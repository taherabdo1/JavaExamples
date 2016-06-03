package codility;

import java.util.HashSet;
import java.util.Set;

public class DistinctValuesNumberInArray {

	public int solution(int[] input) {

		int result = 0;
		//corner case
		if(input.length == 0 || input.length == 1){
			return input.length;
		}
		//normal flow
		Set<Integer> distinctsSet = new HashSet();
		//initialize the set with the values;
		for(int i = 0 ; i < input.length ; i++){
			distinctsSet.add(input[i]);
		}
		//count the set
		return distinctsSet.size();
	}
}
