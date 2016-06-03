package interviewPracticing;

public class ClockAngle {

	public float getAngle(int hour, int minute) {
		float result = 0;
		// make it 12 clock system
		hour %= 12;

		float range = 0f;
		range = (((float) hour * 5) + ((float) minute / 60)) - (float) minute;
		result = (range / 60) * 360;

		return result;
	}
}
