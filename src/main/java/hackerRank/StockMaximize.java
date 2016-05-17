package hackerRank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class StockMaximize {

	static void getMaxStockProfit() {
		Scanner scanner = new Scanner(System.in);
		int testCasesNumber = scanner.nextInt();
		int arraySizeForTestCase;
		int i = 0;
		List<Integer> input;
		BigInteger[] result = new BigInteger[testCasesNumber];
		BigInteger tempResult = null;
		Map<Integer, Integer> sortedValues = null;
		while (i < testCasesNumber) {
			arraySizeForTestCase = scanner.nextInt();
			input = new ArrayList<>(arraySizeForTestCase);

			// get the input for each testCase.
			for (int j = 0; j < arraySizeForTestCase; j++) {
				input.add(scanner.nextInt());
			}
			sortedValues = new HashMap<Integer, Integer>();
			// initialize the sortedMap
			for (int k = 0; k < input.size(); k++) {
				sortedValues.put(k, input.get(k));
			}
			// sort descending
			List<Map.Entry<Integer, Integer>> entries = new ArrayList<Entry<Integer, Integer>>(sortedValues.entrySet());
			Collections.sort(entries, new Comparator<Entry<Integer, Integer>>() {
				@Override
				public int compare(Entry<Integer, Integer> e2, Entry<Integer, Integer> e1) {
					return e1.getValue().compareTo(e2.getValue());
				}
			});
			// handle logic
			// int tempCount = input[0];
			int tempCount = 0;
			BigInteger tempAcc = new BigInteger("0");
			result[i] = new BigInteger("0");
			tempResult = new BigInteger("0");
			for (int j = 0; j < arraySizeForTestCase; j++) {
				if (entries.get(0).getKey() < j) {
					entries.remove(0);
					continue;
				}
				if (input.get(j) < entries.get(0).getValue()) {
					BigInteger temp = new BigInteger("" + input.get(j));
					tempAcc = tempAcc.add(temp);
					tempCount++;
				} else {
					if (tempCount != 0 && !tempAcc.equals(new BigInteger("0"))) {
						BigInteger tempLesses = new BigInteger("" + (input.get(j) * tempCount));
						tempLesses = tempLesses.subtract(tempAcc);
						tempResult = tempResult.add(tempLesses);
						entries.remove(0);
						tempCount = 0;
						tempAcc = new BigInteger("0");
					}
				}
			}
			result[i] = tempResult;
			tempResult = new BigInteger("0");
			i++;

		}
		// scanner.close();

		for (i = 0; i < testCasesNumber; i++) {
			System.out.println(result[i]);
		}
	}

	// static void StairCase(int n) {
	//
	// char[] output = new char[n];
	// for (int i = 0 ; i < n ; i++){
	// output[i] = ' ';
	// }
	// for (int i = n-1 ; i >= 0 ; i--){
	// output[i] = '#';
	// System.out.println(output);
	// }
	// }

	// public static void main(String args[] ) throws Exception {
	// Scanner scanner = new Scanner(System.in);
	// int numberOfInputs = scanner.nextInt();
	// int result =0;
	// for(int i = 0 ; i < numberOfInputs ; i++){
	// result += scanner.nextInt();
	// }
	// System.out.println(result);
	// }

}
