package Level1;

public class DoubleNum {

	public static void main(String[] args) {
		long n = 9;
		long answer = 0;

		for (long i = 0; i < n; i++) {
			if (i * i == n) {
				answer = (i + 1) * (i + 1);
				break;
			} else {
				answer = -1;
			}
		}
		System.out.println(answer);
	}

}
