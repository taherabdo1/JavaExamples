package hackerRank;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class LiberaryFine {

	 
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int d1 = in.nextInt();
	        int m1 = in.nextInt();
	        int y1 = in.nextInt();
	        int d2 = in.nextInt();
	        int m2 = in.nextInt();
	        int y2 = in.nextInt();
	    
	        Date date1 = new Date(y1 , m1 , d1);
	        Date date2 = new Date(y2 , m2 , d2);
	        System.out.println(date1);
	        System.out.println(date2);

	        long diff = date1.getHours() - date2.getHours();
	        int pelanty = 0;
//	        TimeUnit timeUnit = TimeUnit.HOURS;
	        System.out.println(diff/(1000*60*60*24));

//	        pelanty += 
		   	 
	 }
}
