package interviewPracticing;

public class TryFinalyScinarios {

	public static void main(String[] args) {

		testFinaly();
		System.out.println("Main clause called after return from finaly-------------------------");

	}

	private static int testFinaly() {

		try {
			throw new Exception();
		} catch (Exception e) {
			return 1;
			// e.printStackTrace();
		} finally {
			System.out.println("finally clause called-------------------------");
		}
	}
}
