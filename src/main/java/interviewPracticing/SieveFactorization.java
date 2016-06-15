package interviewPracticing;

public class SieveFactorization {

	
	static int [] factors;
	
	
	
	public SieveFactorization(int size) {
		super();
		factors = new int[size-1];
	}

	/**
	 * https://codility.com/media/train/9-Sieve.pdf
	 * @param n
	 * @return int [] holds the lowest prime devisor
	 */
	public static void factorize(int n){
//		int [] factors = new int[n-1];
		factors[0] = factors[1] = 0;
		int i = 2;
		int k;
		while(i*i <= n){
			if(factors[i-2] == 0)			// means this item is prime
			{
				k = i*i;
				while(k <= n){
					if(factors[k-2] == 0)
						factors[k-2] = i; 
					k += i;
				}
			}
			i++;
		}
		
	}
	
	//unfinished
	static int getSemiPrimeCount(int n){
	
		
		return 0;
	}
	
	
	public static void main(String[] args){
		factorize(20);
		for (int i = 0; i < factors.length ; i++) {
			System.out.println(factors[i]);
			
		}
	}
}
