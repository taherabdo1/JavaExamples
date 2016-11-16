package interviewPracticing;

/**
 * 
 * Count Negative Numbers in a Column-Wise and Row-Wise Sorted Matrix Find the
 * number of negative numbers in a column-wise / row-wise sorted matrix M[][].
 * Suppose M has n rows and m columns.
 * 
 */
public class CountNegativeNumbers {

	public static int countNegative(int [][] matrix, int rows, int columns){
		int result = 0;
		int j = columns-1 ;
		for(int i = 0 ;i < rows;i++){
			for(; j>=0;){
				if(matrix[i][j]<0){
					result += j+1;
					break;
				}else{
					j--;
				}
			}
		}
		
		return result;
	}
	
	
	public static void main(String[] args){
		int [][] matrix = {{-3, -2, -1,  1},{-2,  2,  3,  4},{4,  5,  7,  8}};
		System.out.println(countNegative(matrix, 3, 4));
	}
}
