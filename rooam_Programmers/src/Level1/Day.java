package Level1;

public class Day {

	public static void main(String[] args) {
		String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
		int[] ab = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String answer = null;
		int d = 0;

		int a = 5;
		int b = 24;

		for (int i = 0; i < ab.length; i++) {
			for (int j = 0; j < ab[i]; j++) {
				if (i == a - 1 && j == b - 1) {
					i = ab.length + 1;
					break;
				}
				if (d == day.length) {
					d = 0;
				}
				d++;
			}
		}
		answer = day[d];
		System.out.println(answer);
	}
}
