package Level1;

public class DivNum {

	public static void main(String[] args) {
		int n = 5;
		int sum = 0;

		for (int i = 1; i < n + 1; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		
	}

}
