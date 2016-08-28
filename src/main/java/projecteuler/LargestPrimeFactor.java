package projecteuler;

import java.util.Stack;

public class LargestPrimeFactor {

	//to hold the prime numbers
	static Stack<Long> primes = new Stack<>();
	
	//check if a number is prime
	private static boolean isPrime(Long number){
		primes.push(1L);
		primes.push(2L);
		boolean result = true;
		
		//corner cases
		if(number == 0)
			return false;
		if(number == 1 || number == 2)
			return true;
		
		for(long i  =primes.peek() ; i*i<= number ; i++){
			if(number% i == 0){
				result = false;
				break;
			}
		}
		primes.push(number);
		return result;
		
	}
	
	//get the largest prime factor
	private static Long getLargestPrimeFactor(Long number){
		long result = 1;
		if(number == 0)
			return 1L;
		if(number == 1 || number == 2)
			return number;
		for(long i = 2 ; i < number ; i++){
			if(number % i == 0 && isPrime(i)){
				result = i;
			}
		}
		return result;
	}
	public static void main(String[] args){
//		System.out.println(isPrime(54499L));
		System.out.println(getLargestPrimeFactor(600851475143L));
	}
}
