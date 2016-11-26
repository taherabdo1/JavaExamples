package leet_code;

/*
 * URL: https://leetcode.com/problems/circular-array-loop/
 * You are given an array of positive and negative integers. If a number n at an index is positive, then move forward n steps. Conversely, if it's negative (-n), move backward n steps. Assume the first element of the array is forward next to the last element, and the last element is backward next to the first element. Determine if there is a loop in this array. A loop starts and ends at a particular index with more than 1 element along the loop. The loop must be "forward" or "backward'.

 Example 1: Given the array [2, -1, 1, 2, 2], there is a loop, from index 0 -> 2 -> 3 -> 0.

 Example 2: Given the array [-1, 2], there is no loop.

 Note: The given array is guaranteed to contain no element "0".

 Can you do it in O(n) time complexity and O(1) space complexity?
 */
public class CircularArrayLoop {

	public static boolean circularArrayLoop(int[] nums) {
		boolean result = false;

		int numberOfIncludedNodes = 0; // to handle if the chain is of length 2
		int currentIndex = 0;
		int currentAccSume = 0; // to hold the value to the current node
		int negativeNumberFirstIndex = -1; // to check if the input array has
											// negative numbers and hold the
											// index of the first element
		int i = 0;
		// to check that it will work until the end of the array
		while (currentIndex < nums.length && i < nums.length) {
			if (nums[i] < 0) {
				if (negativeNumberFirstIndex < 0)
					negativeNumberFirstIndex = i;
				currentIndex = i;

				i++;
				continue;
			}
			// check if the current node holds the same as the size of the
			// array, if so, check if the node more than 2 nodes and return
			// true, else return false
			if (Math.abs(nums[i]) % nums.length == 0) {
				if (numberOfIncludedNodes > 2)
					return true;
				else {
					currentIndex++;
					i = currentIndex;
					currentAccSume = 0;
					numberOfIncludedNodes = 0;
					continue;
				}
			}
			currentAccSume += nums[i % nums.length];
			numberOfIncludedNodes++;
			if (currentAccSume % nums.length == 0) {
				// found a loop but of length 2
				if (numberOfIncludedNodes <= 2) {
					currentIndex++;
					i = currentIndex;
					numberOfIncludedNodes = 0;
					currentAccSume = 0;
					continue;
				}
				result = true;
				return result;
			} else if (currentAccSume > nums.length) {
				currentAccSume -= nums[currentIndex];
				currentIndex += 1;
				i = currentIndex;
			} else { // currentAccSume < nums.length
				i += nums[i] % nums.length;
			}

		}
		if (negativeNumberFirstIndex >= 0) {
			i = negativeNumberFirstIndex;
			currentIndex = i;
			currentAccSume = 0; // to hold the value to the current node
			numberOfIncludedNodes = 0;
			while (Math.abs(currentIndex) < nums.length) {
				if (nums[i] > 0) {
					currentIndex++;
					i = currentIndex;
					currentAccSume = 0;
					numberOfIncludedNodes = 0;
					continue;
				}
				// check if the current node holds the same as the size of the
				// array, if so, check if the node more than 2 nodes and return
				// true, else return false
				if (Math.abs(nums[i]) % nums.length == 0) {
					if (numberOfIncludedNodes > 2)
						return true;
					else {
						currentIndex++;
						i = currentIndex;
						currentAccSume = 0;
						numberOfIncludedNodes = 0;
						continue;
					}
				}
				currentAccSume += nums[Math.abs(i % nums.length)];
				numberOfIncludedNodes++;
				if (Math.abs(currentAccSume) % nums.length == 0) {
					if (numberOfIncludedNodes < 2) {
						currentIndex++;
						i = currentIndex;
						numberOfIncludedNodes = 0;
						currentAccSume = 0;
						continue;
					}
					result = true;
					return result;
				} else if (Math.abs(currentAccSume) > nums.length) {
					currentAccSume -= nums[currentIndex];
					currentIndex += 1;
					i = currentIndex;
				} else { // currentAccSume < nums.length
					if (i + nums[i] % nums.length < 0) { // if i became less
															// than 0 start from
															// the other
															// side(the end of
															// the array)
						i = nums.length - (Math.abs(nums[i] % nums.length + i));
					} else {
						i += nums[i] % nums.length;

					}
				}

			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] testInput = { 4, 1, 2, 2, 1, 2 };
		int[] testInput2 = { 2, -1, 1, 2, 2 };
		int[] testInput3 = { -2, -1, 1, -2, 2 }; // to test the negative loop
		int[] testInput4 = { -1, 2 }; // check the chain of 2 node
		int[] testInput5 = { 1, 2, 3, 4, 5 };
		int[] testInput6 = { -2, 1, -1, -2, -2 };
		int[] testInput7 = { -1, -2, -3, -4, -5 };
		int[] testInput8 = {1, -2}; 
		int[] testInput9 = {3,1,2}; 

//		System.out.println(circularArrayLoop(testInput));
//		 System.out.println(circularArrayLoop(testInput2));
//		 System.out.println(circularArrayLoop(testInput3));
//		 System.out.println(circularArrayLoop(testInput4));
//		 System.out.println(circularArrayLoop(testInput5));
//		 System.out.println(circularArrayLoop(testInput6)); //should output
//		// false
//		System.out.println(circularArrayLoop(testInput7)); // should output
//															// false
//		System.out.println(circularArrayLoop(testInput8));	//false
		System.out.println(circularArrayLoop(testInput9));	//true`

	}
}
