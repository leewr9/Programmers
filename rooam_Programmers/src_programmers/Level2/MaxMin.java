package Level2;

public class MaxMin {

	public static void main(String[] args) {
		String s = "-1 -1";
		String[] sNum = s.split(" ");
		int[] num = new int[sNum.length];
		int max = 0;
		int min = 0;

		for (int i = 0; i < sNum.length; i++) {
			num[i] = Integer.valueOf(sNum[i]);
			if (num[i] < max) {
				max = num[i];
			}
		}

		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}

		min = max;

		for (int i = 0; i < num.length; i++) {
			if (num[i] <= min) {
				min = num[i];
			}
		}
		
		String answer = String.valueOf(min)+" "+String.valueOf(max);
		System.out.println(answer);

	}

}
