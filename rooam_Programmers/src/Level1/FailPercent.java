package Level1;

public class FailPercent {

	public static void main(String[] args) {
		int N = 5 + 1;
		int[] stages = { 2, 1, 2, 2, 2, 4, 2, 2 };
		int[] answer = new int[N - 1];

		int[][] stage = new int[N][2];// 0번 총 인원수 1번 현재 도전중
		double temp = -1;
		double s = 0;
		int index = 0;

		for (int i = 0; i < stages.length; i++) {
			for (int j = 0; j < stage.length; j++) {
				if (j <= stages[i] - 1) {
					stage[j][0]++;
				}
			}
			stage[stages[i] - 1][1]++;
		}

		for (int j = 0; j < answer.length; j++) {
			temp = -1;
			index = 0;

			for (int i = 0; i < stage.length - 1; i++) {
				s = (double) (stage[i][1]) / (double) (stage[i][0]);
				if (Double.isNaN(s)) {
					s = 0;
				}
				if (temp < s) {
					temp = s;
					index = i;
				}
			}
			answer[j] = index + 1;
			stage[index][0] = -1;
			stage[index][1] = 1;
		}

		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}
