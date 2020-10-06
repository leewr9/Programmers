package Level2;

public class Tonurment {

	public static void main(String[] args) {
		int n = 8;
		int a = 4;
		int b = 7;
		int answer = 0;
		
		while (n > 0) {
			if (a % 2 == 1) a += 1;
			if (b % 2 == 1) b += 1;
			
			if (Math.abs(a - b) <= 1) {
				answer++;
				break;
			}

			if (a > 1) a /= 2;
			if (b > 1) b /= 2;

			answer++;
			n = n / 2;
		}
		System.out.println(answer);

	}
}
