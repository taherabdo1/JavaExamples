package algorithms;

import java.util.Scanner;

/**
 * 
 * @author abdelmta
 *
 *https://www.hackerrank.com/challenges/circular-array-rotation
 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
 */
public class CircularArrayRotation {

		public static void main(String []args){
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int k = in.nextInt();
			int q = in.nextInt();
			int[] input = new int[n];
			int[] positions = new int[q];
			int start = 0 ; // indicator to the start of the array after shifting k times
			
			//get input array
			for(int i = 0 ; i < n ; i++){
				input[i] = in.nextInt();
			}
	
			//get positions
			for(int i = 0 ; i < q ; i++){
				positions[i] = in.nextInt();
			}
			
			//this way the start is on the right beginning after shift
			if(k != n)
				start = (k%n);	
			else
				start = 0;
			
			//get the output
			for(int i = 0 ; i < q ; i++){
				//this will happen if we reached the end of the array
				if(start + positions[i] >= n){
					System.out.println(input[((start + positions[i]) % n)]);
				}
				else{
					System.out.println(input[start+positions[i]]);				
				}
			}
			in.close();
		}
	
}
