package Level1;

public class Test {

	public static void main(String[] args) {
		int[] answers = { 1, 2, 3, 4, 5 };// ¹®Á¦
		int[] answer;

		int[][] fst = { 
				{ 1, 2, 3, 4, 5 }, 
				{ 2, 1, 2, 3, 2, 4, 2, 5 }, 
				{ 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } 
		};
		
		int[] cnt = new int[3];
		int n = 0;

		int s = 0;
		int a = 0;

		for (int i = 0; i < fst.length; i++) {
			for (int j = 0; j < answers.length; j++) {
				if (fst[i][n] == answers[j]) {
					cnt[i]++;
				}
				n++;
				if (n == fst[i].length) {
					n = 0;
				}
			}
			n = 0;
			if (cnt[i] >= s) {
				s = cnt[i];
			}
		}

		for (int i = 0; i < cnt.length; i++) {
			if (s == cnt[i]) {
				a++;
			}
		}

		answer = new int[a];
		a = 0;

		for (int i = 0; i < cnt.length; i++) {
			if (s == cnt[i]) {
				answer[a] = i + 1;
				a++;
			}
		}
	}
}
