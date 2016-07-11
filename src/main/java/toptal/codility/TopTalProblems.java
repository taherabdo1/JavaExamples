package toptal.codility;

public class TopTalProblems{
	
	public static void main(String[] args){
		int[] test1 = {5,5,1,7,2,3,5};
		System.out.println(solution(5,test1));
	}
	
	
	//task 1
	public static int solution(int X, int[] A) {

		//corner cases
		if(A.length == 0)
			return -1;
		
		int result = -1;
		int[] xCounter = new int[A.length];
		int xCounts =0;
		//initialize the count of x at each index

		for(int i = 0 ; i < A.length ; i++){
			if(A[i] == X){
				xCounts++;
			}
			xCounter[i] = xCounts;
		}
		
		//check (the logic)
		for(int i = 1 ; i < xCounter.length ; i++){
			if(xCounter[i-1] == ((xCounter.length - i) - (xCounter[xCounter.length-1] - xCounter[i]))){
				return i;
			}
		}
		return result;
    }
	
	//task 3
	  public static int solution4(int A, int B) {
	      int result = -3;
	      
	      if((A+B) % 3 == 0){
	    	  result = (A+B) /3;
	      }
	      else if((A == 0 )&& B % 2 == 0){
	    	  result = B / 2;
	      }
	      else if((B == 0 ) && A % 2 == 0){
	    	  result = A / 2;
	      }
	      else if(A == 1 && (B % 2 == 0 && B % 3 != 0))
	    	  result = (B / 2) +1;
	      else if(B == 1 && (A % 2 == 0 && A % 3 != 0))
	    	  result = (A / 2) +1;
	      
	      
	      ///check the result
	      if(result == -3){
	    	  return -1;		//no solution found
	      }else if(result > 100_000_000)
	    	  return -2;
	      
	      return result;
	    }
	  
	  //task 3
	    public int[] solution3(int[] A) {
	    	int temp  =0 ;
	    	int twos = 0;
	    	int[] result = new int[A.length+2];
	    	for(int i = 0 ; i < A.length ; i++){
	    		temp += (A[i] * Math.pow(-2, twos));
	    		twos++;
	    	}
	    	//temp holds the input value now
	    	
	    	//calculate the opposite value.
	    	
	    	
	    	return result;
	    }	    	
}