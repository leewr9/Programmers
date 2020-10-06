package Level2;

public class NumShow {

	public static void main(String[] args) {
		int n = 15;
		int answer = 1;
		int sum = 0;

		for (int j = 1; j <= n; j++) {
			for (int i = j; i <= n / 2 + 1; i++) {
				sum += i;
				if (sum > n) {
					break;
				}
				if (sum == n) {
					answer++;
					break;
				}
			}
			sum = 0;
		}

		System.out.println(answer);

	}

}
