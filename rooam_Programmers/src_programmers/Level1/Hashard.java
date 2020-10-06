package Level1;

public class Hashard {

	public static void main(String[] args) {
		int arr = 10;
		boolean answer = true;
		int hashard = 10;
		int sum = 0;
		while (arr > 0) {
			sum += hashard % 10;
			hashard = hashard / 10;
		}

		if (arr % sum == 0) {
			answer = true;
		} else {
			answer = false;
		}
		System.out.println(answer);
	}
}
