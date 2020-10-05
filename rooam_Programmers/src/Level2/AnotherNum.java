package Level2;

public class AnotherNum {

	public static void main(String[] args) {
		long n = 16;
		String answer = "";
		long rule = 3;
		long last = 3;
		// 1 1 2 2 3 4 4 11 5 12 6 14 7 21 8 22 9 24 10 41 11 42 12 44 13 111 14 112 15
		// 114
		// 16 121 17 122 18 124 19 141 20

		while (n > 0) {
			rule = 3;
			last = 3;

			if (n % rule == 0) {
				answer = "4" + answer;
				last = (last + (n / rule - 2) + (n / rule));
				n = n - last;
			} else if (n % rule == 1) {
				answer = "1" + answer;
				n = (n - (n % rule)) / rule;
			} else if (n % rule == 2) {
				answer = "2" + answer;
				n = (n - (n % rule)) / rule;
			}
		}

		System.out.println(answer);

	}
}
