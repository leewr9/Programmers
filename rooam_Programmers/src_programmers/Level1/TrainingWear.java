package Level1;

public class TrainingWear {
	public static void main(String[] args) {
		int n = 5;
		int[] lost = { 1, 2 };
		int[] reserve = { 2, 3 };

		n = n - lost.length;// ���� �ο� �A �Ѱ�

		int answer = 0;// ���� �����

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
