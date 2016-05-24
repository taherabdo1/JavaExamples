package hackerRank;

import java.util.Scanner;

public class TaumAndBday {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		long[] result = new long[t];
		for (int a0 = 0; a0 < t; a0++) {
			long b = in.nextLong();
			long w = in.nextLong();
			long x = in.nextLong();
			long y = in.nextLong();
			long z = in.nextLong();

			if(x+z < y){
				result[a0]= (x*b) + (x+z)*w;
			}else if(y+z < x){
				result[a0]= (y*w + (y+z)*b);				
			}else{
				result[a0] = x*b + y*w; 
			}
			
		}

		for(int i = 0 ; i < t ; i++){
			System.out.println(result[i]);
		}
	}
}
