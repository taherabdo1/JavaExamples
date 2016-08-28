package toptal.codility;

import java.util.ArrayList;
import java.util.List;

public class ConvertBaseNegativeTwoToTheOppositeDecimal {

	public static void main(String[] args){
		List<Integer> testInnput = new ArrayList<>();
		List<Integer> testInnput2 = new ArrayList<>();
		testInnput.add(1);
		testInnput.add(0);
		testInnput.add(0);
		testInnput.add(1);
		testInnput.add(1);
		testInnput.add(1);
		testInnput2 = solution(testInnput);
		for(int i = 0 ; i < testInnput2.size() ; i++){
			System.out.println(testInnput2.get(i));
		}
		
	}
	private static List solution(List<Integer> binaryNumber){
		int result = 0;
		for(int i = 0 ; i < binaryNumber.size() ; i++){
			result += (binaryNumber.get(i) * Math.pow(-2, i));
		}
		return getNegBase2FromDec(result*-1);
	}
	public static List getNegBase2FromDec(int negNum){
		List<Integer> result = new ArrayList<>();

		int remain =0 ;
		while (negNum != 0){
			remain = negNum%-2;
			negNum /= -2;
			
			if(remain < 0){
				remain+=2;
				negNum+=1;
			}
			result.add(remain);
		}
		return result;
		}
}
