package java_7_new_features;

import java.util.LinkedList;
import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		// testNewSwich();

		// LinkedList<Integer> testFibu = new LinkedList<>();
		// testFibu.add(34);
		// testFibu.add(8);
		// testFibu.add(13);
		// testFibu.add(7);
		// testFibu.add(1000);
		// for(Integer i : getFibunitche(testFibu)){
		// System.out.println(i);
		// }
		// test new numiricals representation;
		int x = 0b01110101;
		System.out.println(x);
		int y = 100_234_32;
		System.out.println(y);

	}

	// Strings in switch
	void testNewSwich() {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		switch (input) {
		case "ahmed":
			System.out.println("ahmed");
			break;

		case "taher":
			System.out.println("taher");
			break;

		default:
			System.out.println("default");
			break;
		}


	}

	// get a linkedList of all fibunatche elements from an other input
	// linkedList
	LinkedList<Integer> getFibunitche(LinkedList<Integer> input) {

		LinkedList<Integer> output = new LinkedList<>();
		int temp;
		while (!input.isEmpty()) {
			if (isFibuniche(temp = input.poll())) {
				output.add(temp);
			}
		}

		return output;
	}

	boolean isFibuniche(int num) {
		return (isWellSquared((num * num * 5) + 4))
				|| (isWellSquared((num * num * 5) - 4)) ? true : false;
	}

	boolean isWellSquared(int x) {
		return (Math.pow(Math.sqrt(x), 2) == x);
	}
}
