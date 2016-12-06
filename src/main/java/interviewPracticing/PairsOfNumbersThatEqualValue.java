package interviewPracticing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.naming.spi.DirStateFactory.Result;

/*
 * [12/4/2016 11:22:31 AM] Mohamed El Ahmady:  هيديك رقم وارراى
[12/4/2016 11:22:46 AM] Mohamed El Ahmady: وعاوز عدد الpairs اللى مجموعهم بيساوى الرقم
 */
public class PairsOfNumbersThatEqualValue {

	public static int getCountOfPairs(int[] numbers , int value){
		int result = 0;
		Map <Integer,Integer> numbersRepeats = new HashMap<>();
		
		//initialize the map
		for(int i = 0; i < numbers.length ; i++){
			if(numbersRepeats.get(numbers[i]) == null){
				numbersRepeats.put(numbers[i], 1);
			}else{
				numbersRepeats.put(numbers[i], numbersRepeats.get(numbers[i])+1);
			}
		}
		for(Entry<Integer,Integer> entry : numbersRepeats.entrySet()){
			int minimum = Integer.MAX_VALUE;
			if((Integer)entry.getValue() != 0){
				if(numbersRepeats.get(value - (Integer)entry.getKey()) != null && numbersRepeats.get(value - (Integer)entry.getKey()) != 0){
					minimum = Math.min(entry.getValue(), numbersRepeats.get(value - (Integer)entry.getKey()));
					result+=minimum;
					numbersRepeats.put((Integer) entry.getKey(), numbersRepeats.get(entry.getKey())-minimum);
					numbersRepeats.put(value - entry.getKey(), numbersRepeats.get(entry.getKey())-minimum);
				}				
			}
		}
		return result;
	}
	
	
	public static void main(String[] args){
		int[] testArray = {1,2,3,4,5,6,7,8,9,10,11,12,12,13,4,5,67,9,87,6,5,4,3,2};
		System.out.println(getCountOfPairs(testArray, 9));
	}
}
