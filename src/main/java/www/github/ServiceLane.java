package www.github;

import java.util.Scanner;

public class ServiceLane {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int arraySize = in.nextInt();
		// System.out.println(x);
		int testsNumber = in.nextInt();
		//read lanes
		int[] lanes = new int[arraySize];
		int temp = 0 ;
		while(temp < arraySize){
			lanes[temp] = in.nextInt();
			temp++;
		}
		
		//result array
		int[] results = new int[testsNumber];

		
		int i, j, counter = 0;
		int min = Integer.MAX_VALUE;
		while (counter < testsNumber) {
			i = in.nextInt();
			j = in.nextInt();
			for (int k = i; k <= j; k++) {
				if(lanes[k] < min)
					min = lanes[k];
			}
			results[counter]  = min;
			min = Integer.MAX_VALUE;
			counter++;
		}
		
		for(i = 0 ; i < results.length ; i++){
			System.out.println(results[i]);
		}

	}

}
