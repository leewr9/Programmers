package Level2;

public class PrimeFind {

	public static void main(String[] args) {
		String numbers = "17";
		String[] arr = numbers.split("");
		int p = 10;
		int[] prime;
		int cnt = 0;
		for (int i = 0; i < numbers.length() - 1; i++) {
			p = p * 10;
		}

		prime = new int[p];

		for (int i = 2; i < p; i++) {
			if (prime[i] == 0) {
				for (int j = i + i; j < p; j = j + i) {
					prime[j] = 1;
				}
			}
		}

		for (int i = 2; i < p; i++) {
			if (prime[i] == 0) {
				for (int j = 0; j < arr.length; j++) {
					
				}
			
		}

	}
}
