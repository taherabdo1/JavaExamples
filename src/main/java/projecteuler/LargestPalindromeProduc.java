package projecteuler;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * https://projecteuler.net/problem=4
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class LargestPalindromeProduc {

	public static void main (String [] args){
		System.out.println(solition());
	}
	
	public static int solition(){
		
		// get all the palendroms
		Stack<Integer> palendoms = new Stack<>(); 
		for(int i = 500_000 ; i <= 998_001 ; i++){///998_001 is the max 999 * 999
			if(isPalendromNumber(i))
				palendoms.push(i);
		}
		int temp;
		while(!palendoms.isEmpty()){
			temp = palendoms.pop();
			//check if there is two integers their product equal "temp" and less than 1000
			List<Integer> tempList = getNumberDevisors(temp);
			if(!tempList.isEmpty()){
				System.out.println(tempList.get(0));
				System.out.println(tempList.get(1));			
				return tempList.get(0) * tempList.get(1);
			}
		}
		return -1;
	}
	
	
	private static boolean isPalendromNumber(int number){
		String stringNumber = ""+number;
		for(int i = 0 , j = stringNumber.length() - 1; i < j ; i++ , j--){
			if(stringNumber.charAt(i) != stringNumber.charAt(j))
				return false;
		}
		return true;
	}
	
	private static List getNumberDevisors(int number){
		List<Integer> result = new ArrayList<>();
		for(int i = 999 ; i > 99 ; i--){
			if(number%i == 0 && number/i <= 999){
				result.add(number/i);
				result.add(i);
				break;
			}
		}
		return result;
	}
}
