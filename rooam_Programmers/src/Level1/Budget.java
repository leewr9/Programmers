package Level1;

public class Budget {

	public static void main(String[] args) {
		int[] d = { 1, 2, 4, 5, 6, 1, 2, 3 };
		int budget = 9;
		int answer = 0;
		int cnt = 0;
		int sum = 0;
		int max = 0;

		while (true) {
			sum = 0;
			for (int i = 0; i < d.length; i++) {
				sum += d[i];
			}
			if (sum > budget) {
				max = 0;
				for (int i = 0; i < d.length; i++) {
					if (max < d[i]) {
						max = d[i];
						cnt = i;
					}
					if (i + 1 == d.length) {
						d[cnt] = 0;
					}
				}
			} else {
				break;
			}
		}

		for (int i = 0; i < d.length; i++) {
			if (d[i] != 0) {
				answer++;
			}
		}
		System.out.println(answer);

	}
}
