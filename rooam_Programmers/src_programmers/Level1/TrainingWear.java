package Level1;

public class TrainingWear {
	public static void main(String[] args) {
		int n = 5;
		int[] lost = { 1, 2 };
		int[] reserve = { 2, 3 };

		n = n - lost.length;// 도난 인원 뺸 총값

		int answer = 0;// 빌린 사람수

		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					lost[i] = -1;
					reserve[j] = -1;
					n++;
					break;
				}
			}
		}

		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
					lost[i] = -1;
					reserve[j] = -1;
					answer++;
					break;
				}
			}
		}
		System.out.println(answer);
		
	}
}
