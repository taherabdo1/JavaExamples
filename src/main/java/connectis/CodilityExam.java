package connectis;

public class CodilityExam {

	// get the max 24 based hour system from the input intgers (2,0,0,4)
		// outputs---> 20:40
		public  String getMaxHour(int A, int B, int C, int D) {

			int[] input = { A, B, C, D };
			String result = "";
			int max = -1;
			int choosen = -1;

			// first digit
			for (int i = 0; i < input.length; i++) {
				if (input[i] - 2 <= 0 && input[i] != -1 && input[i] > max) {

					max = input[i];
					choosen = i;
				}

			}
			if (max == -1)
				return "NOT POSSIBLE";
			if (choosen != -1) {
				result += max + "";
				input[choosen] = -1;
			}

			// second digit
			max = -1;
			for (int i = 0; i < input.length; i++) {
				if (input[i] - 4 < 0 && input[i] != -1 && input[i] > max) {
					max = input[i];
					choosen = i;
				}

			}
			if (max == -1)
				return "NOT POSSIBLE";
			if (choosen != -1) {
				result += max + "";
				input[choosen] = -1;
			}
			result += ":";
			// third digit
			max = -1;
			for (int i = 0; i < input.length; i++) {
				if (input[i] - 5 <= 0 && input[i] != -1 && input[i] > max) {
					max = input[i];
					choosen = i;
				}

			}
			if (max == -1)
				return "NOT POSSIBLE";
			if (choosen != -1) {
				result += max + "";
				input[choosen] = -1;
			}

			// fourth digit
			max = -1;
			for (int i = 0; i < input.length; i++) {
				if (input[i] - 9 <= 0 && input[i] != -1 && input[i] > max) {
					max = input[i];
					choosen = i;
				}

			}
			if (max == -1)
				return "NOT POSSIBLE";
			if (choosen != -1) {
				result += max + "";
				input[choosen] = -1;
			}

			return result;
		}

		// get the number of elevator stops based on the number of floors, number of
		// passengers, and the max wieght elevator can hold
		public int getElevatorStopsNumber(int[] A, int[] B, int M, int X, int Y) {

			int result = 0;
			int[] floorStops = new int[M + 1];
			boolean[] isFloorStopCountedBefore = new boolean[M + 1];
			int counter = 0;
			int totalWight = 0;
			if (A.length == 0)
				return 0;
			for (int i = 0; i < A.length;) {
				// take another one
				totalWight += A[i];
				counter++;
				// if this one fit
				if (counter <= X && totalWight <= Y) {
					if (isFloorStopCountedBefore[B[i]] == false) {
						floorStops[B[i]]++; // increment the number of stop for this
											// floor
						isFloorStopCountedBefore[B[i]] = true;
					}
					i++;
				}

				// if this one doesn't fit
				else {
					totalWight = 0;
					counter = 0;
					isFloorStopCountedBefore = new boolean[M + 1]; // reinitialize
																	// the boolean
																	// array
					floorStops[0]++; // for coming back to the ground floor
				}

			}
			// if there is one move up counted but the retrive to ground didn't
			// count
			if (counter != 0)
				floorStops[0]++;

			// count the stops from the floorStops
			for (int i = 0; i < floorStops.length; i++)
				result += floorStops[i];

			return result;

		}

}
