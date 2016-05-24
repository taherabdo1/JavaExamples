package hackerRank;

import java.util.Scanner;

public class ComparetheTriplets {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a0 = in.nextInt();
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int b0 = in.nextInt();
		int b1 = in.nextInt();
		int b2 = in.nextInt();

		int aResult = 0;
		int bResult = 0;
		
		if(a0-b0 > 0){
			aResult+=1;
		}
		else if(a0-b0 < 0){
			bResult+=1;
		}
		
		if(a1-b1 > 0){
			aResult+=1;
		}
		else if(a1-b1 < 0){
			bResult+=1;
		}
		
		if(a2-b2 > 0){
			aResult+=1;
		}
		else if(a2-b2 < 0){
			bResult+=1;
		}
		
		System.out.println(aResult+" "+bResult);
	}
}
