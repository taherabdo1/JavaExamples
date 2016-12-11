package orange_labs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxNumberOfWeeksToSpendInHawaii {

	static String[] weekDays = { "Monday", "Tuesday", "Wednesday", "Thursday",
			"Friday", "Saturda", "Sunda" };
	static Map<String, Integer> monthWithDaysCount = new HashMap<>();
	static List<String> monthes = new ArrayList<>();

	public static int solution(int Y, String A, String B, String W) {

		// initialize the data structures
		init();
		int startDaysCount = 0; // know which day will be the first day in the
								// vacation period represented in integer.

		int daysCountOfTheEndDay = 0; // know which day will be the end day in
										// the vacation period represented in
										// integer.

		int result = 0;
		// get the number of days before the start month
		for (int i = 0; i < 12; i++) {
			// if the year is leap year add more day
			if (i == 1 && isLeapYear(Y)) {
				startDaysCount += 1;
			}
			if (monthes.get(i).equals(A)) { // this means that is the start
											// month
				break;
			} else { // means still before the start month
				startDaysCount += monthWithDaysCount.get(monthes.get(i));
			}
		}

		// get the number of days before the end of the end month
		for (int i = 0; i < 12; i++) {
			// if the year is leap year add more day
			if (i == 1 && isLeapYear(Y)) {
				daysCountOfTheEndDay += 1;
			}
			daysCountOfTheEndDay += monthWithDaysCount.get(monthes.get(i));
			if (monthes.get(i).equals(B)) { // this means that is the end month
				break;
			}
		}

		//calculate the first monDay in after the start day.
		int daysCountFromTheStartDayOfTheYearToMonDay = 0; // if sunDay for
															// example should
															// return 6
		for (int i = 1; i < 7; i++) {
			// this means the current day is equal the start day of the year
			if (weekDays[i].equals(W)) {
				daysCountFromTheStartDayOfTheYearToMonDay = i;
				break;
			}
		}

		int daysCountWithincompleteWeeks = startDaysCount
				+ (7 - (startDaysCount % 7));

		if (daysCountFromTheStartDayOfTheYearToMonDay <= daysCountWithincompleteWeeks
				- startDaysCount) {
			startDaysCount += daysCountWithincompleteWeeks - startDaysCount;
		} else {
			startDaysCount += 7 - (daysCountWithincompleteWeeks - startDaysCount);
		}

		result = (daysCountOfTheEndDay - startDaysCount) / 7;
		return result;
	}

	private static boolean isLeapYear(int year) {
		return year % 4 == 0;
	}

	private static void init() {
		monthWithDaysCount.put("January", 31);
		monthWithDaysCount.put("February", 28);
		monthWithDaysCount.put("March", 31);
		monthWithDaysCount.put("April", 30);
		monthWithDaysCount.put("May", 31);
		monthWithDaysCount.put("June", 30);
		monthWithDaysCount.put("July", 31);
		monthWithDaysCount.put("August", 31);
		monthWithDaysCount.put("September", 30);
		monthWithDaysCount.put("October", 31);
		monthWithDaysCount.put("November", 30);
		monthWithDaysCount.put("December", 31);
		monthes.add("January");
		monthes.add("February");
		monthes.add("March");
		monthes.add("April");
		monthes.add("May");
		monthes.add("June");
		monthes.add("July");
		monthes.add("August");
		monthes.add("September");
		monthes.add("October");
		monthes.add("November");
		monthes.add("December");
	}

	public static void main(String[] args) {
		System.out.println(solution(2014, "April", "April", "Wednesday"));

		// System.out.println(90%7);
	}
}
