package Level1;

public class SDWord {

	public static void main(String[] args) {
		int num = 3;
		String answer = "";

		switch (num % 2) {
		case 0:
			answer = "Even";
			break;
		default:
			answer = "Odd";
			break;
		}
		System.out.println(answer);

	}
}
