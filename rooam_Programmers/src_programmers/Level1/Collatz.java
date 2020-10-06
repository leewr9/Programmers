package Level1;

public class Collatz {

	public static void main(String[] args) {
		int n = 6;
		int brk = 0;
		int answer = 0;
		long num = n;

		while (num != 1) {
			if (num % 2 == 0) {
				num = num / 2;
				answer++;
			} else {
				num = (num * 3) + 1;
				answer++;
			}

			if (brk >= 500) {
				answer = -1;
			}

			brk++;
		}
		System.out.println(answer);
	}

}
