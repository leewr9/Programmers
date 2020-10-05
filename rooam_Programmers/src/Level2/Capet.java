package Level2;

public class Capet {

	public static void main(String[] args) {
		int brown = 8;
		int yellow = 1;
		int[] answer = new int[2];
		
		int sum = 0;
		int save = 0;
		for (int i = 1; i <= (brown + yellow); i++) {
			save = (brown + yellow) / i;
			if ((brown + yellow) % i == 0 && save <= i) {
				sum = (i + i) + ((save - 2) * 2);
				if (sum == brown) {
					answer[0] = i;
					answer[1] = save;
					break;
				}
			}
		}
		System.out.println(answer[0]);
		System.out.println(answer[1]);

	}

}
