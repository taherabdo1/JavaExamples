package codility;

public class MinPerimeterRectangle {

	public int solution(int n){
		int result = Integer.MAX_VALUE;
		for(int i = 1 ; i * i <= n ; i++){
			if(n%i != 0)
				continue;
			result = Math.min(result , (2*(i + (n/i))));
		}
		return result;
	}
}
