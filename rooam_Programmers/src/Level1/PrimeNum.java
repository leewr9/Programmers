package Level1;

public class PrimeNum {

	public static void main(String[] args) {
		long n = 10000;
		// 1,2,3,4,5,6,7,8,9,10,11,13,17,19,21,23,25,27,29,31,37,41,43
		// 0 1 1 0 1 0 1 0 0 0 1 1
		int[] prime = new int[(int) n + 1];
		int answer = 0;
		prime[0] = 1;
		prime[1] = 1;

		for (int i = 2; i <= n; i++) {
			if (prime[i] != 1) {
				for (int j = i + i; j <= n; j = j + i) {
					prime[j] = 1;	
				}
			}
		}

		for (int i = 0; i <= n; i++) {
			if (prime[i] == 0) {
				answer++;
			}
		}

		System.out.println(answer);
	}
}
