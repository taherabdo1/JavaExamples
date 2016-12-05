package projecteuler;

/*
 * URL: https://projecteuler.net/problem=6
 * 
 * The sum of the squares of the first ten natural numbers is,

 12 + 22 + ... + 102 = 385
 The square of the sum of the first ten natural numbers is,

 (1 + 2 + ... + 10)2 = 552 = 3025
 Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

 Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class SumSquareDifference {

	public static long getDiff(){
		long sumOfIndeviduals = 0L;
		long sumOfSquar = 0L;
		
		for(int i =1 ; i<= 100 ; i++){
			sumOfIndeviduals+=i;
			sumOfSquar+=(Math.pow(i, 2));
		}

		return (long) (sumOfSquar-Math.pow(sumOfIndeviduals, 2));
	}
	
	
	public static void main(String[] args){
		System.out.println(getDiff());
	}
}
