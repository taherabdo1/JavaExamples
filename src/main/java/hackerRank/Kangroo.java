package hackerRank;

import java.util.*;

public class Kangroo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		// no cases
		if ((x1 <= x2 && v1 < v2) || (x2 <= x1 && v2 < v1))
			System.out.println("false");
		else
			System.out.println("false");
	}
}
