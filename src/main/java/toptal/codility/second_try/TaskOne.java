package toptal.codility.second_try;

import java.util.HashMap;
import java.util.Map;

public class TaskOne {

    public static int solution(int[] A) {
    	int result = 0;
    	if(A.length == 0 || A.length == 1){
    		return 0;
    	}
    	
    	Map<Integer, Integer> counts = new HashMap<>();
    	//get the counts for each element
    	for(int i = 0 ; i < A.length ; i++){
    		if(counts.containsKey(A[i])){
    			counts.put(A[i], counts.get(A[i] )+1);
    		}else{
    			counts.put(A[i], 1);
    		}
    	}
    	for(java.util.Map.Entry<Integer, Integer> ele : counts.entrySet()){
    		if(ele.getValue() > 1 && result < 1000_000_000)
    			result += count(ele.getValue());
    		if(result >= 1000_000_000)
    			return 1000_000_000;
    	}
//    	System.out.println(count(6));
    	return result;
    }
    
    
    private static int count(int repeats){
    	int result = 0;
    	for(int i = repeats ; i > 1 ; i--){
    		result += (i-1);
    	}
    	
    	return result;
    }
    
    
    public static void main(String[] args){
    	int[] test = new int[7];
    	test[0] = 3;
    	test[1] = 5;
    	test[2] = 6;
    	test[3] = 3;
    	test[4] = 3;
    	test[5] = 5;
    	test[6] = 5;    	
    	System.out.println(solution(test));

    }
}
