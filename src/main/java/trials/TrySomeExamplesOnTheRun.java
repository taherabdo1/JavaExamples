package trials;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TrySomeExamplesOnTheRun {

	public static void main(String[] args){
		// get the date four weeks before
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(new Date());
		calendar.add(Calendar.DATE, - 7);	//4 weeks * 7 days
		Date startDate = calendar.getTime();

		System.out.println(startDate);
	}
}
