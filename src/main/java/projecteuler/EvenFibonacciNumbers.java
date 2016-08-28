package projecteuler;

import java.util.HashSet;
import java.util.Set;

public class EvenFibonacciNumbers {

	// hold evens
	static Set<Long> evens = new HashSet<>();

	// get fibunacci usnig top down recursion
	private static long fibunatchi(long num) {
		if (num == 1 || num == 0)
			return num;

		long res = fibunatchi(num - 1) + fibunatchi(num - 2);
		if (res % 2 == 0) {
			// System.out.prlongln(res);
			evens.add(res);
		}
		return res;
	}

	// get fibunacci for loop
	private static long getFibunacciUsingFor(long num) {
		long result = 0;
		long finalResult = 0;
		long n1 = 0, n2 = 1;
		for (int i = 2; result <= 4_000_000 && i <= num; i++) {
			result = (n1 + n2);
			// if the result is even
			if (result % 2 == 0)
				finalResult += result;
			n1 = n2;
			n2 = result;
		}
		System.out.println(finalResult);

		return result;
	}

	public static void main(String[] args) {
		System.out.println(fibunatchi(40));
		long result = 0;
		for (Long num : evens)
			result += num;
		System.out.println(result);

		System.out.println("test for loop: " + getFibunacciUsingFor(100));
	}

}
