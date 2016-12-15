package cliqz;

import java.util.HashMap;
import java.util.Map;

public class TaskOne {

	
	 public static int solution(int[] A) {
		 int result = 0;
		 
		 boolean[] isVisitedBefore = new boolean[A.length];
		 
		 if(A.length == 1)
			 return 1;
		 if(A.length==0)
			 return 0;
		 //initialize the array by false
		 for(int i = 0 ; i < A.length ; i++){
			 isVisitedBefore[i] = false;
		 }
		 int i = 0;
		 for(; i < A.length ;){
			 //if visited before this means there is a loop and we should return -1
			 if(isVisitedBefore[i] == true){
				 return -1;
			 }else{
				 isVisitedBefore[i] = true;
				 result++;
				 i+=A[i];
			 }
		 }
		 return result;
	    }
	
	
	public static void main(String[] args){
		
		int[] testArray = 	{2,3,-1,1,3};
		int[] testArray2 = 	{1,1,-1,1};

		System.out.println(solution(testArray));
	}
}
