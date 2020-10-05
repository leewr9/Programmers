package Level1;

public class KNumber {

	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		int[] answer = new int[commands.length];
		int[] ary;
		int cnt = 0;
		int a = 0;
		int s = 0;
		//선언
		while (cnt < commands.length) {
			a = 0;
			ary = new int[(commands[cnt][1] - commands[cnt][0]) + 1];
			for (int i = commands[cnt][0]-1; i < ary.length + commands[cnt][0]-1; i++) {
				ary[a] = array[i];
				a++;
			}
			for (int i = 0; i < ary.length; i++) {
				a = i;
				for (int j = i + 1; j < ary.length; j++) {
					if (ary[a] > ary[j]) {
						a = j;
					}
					if (j + 1 == ary.length) {
						s = ary[a];
						ary[a] = ary[i];
						ary[i] = s;
					}
				}
			}
			answer[cnt] = ary[commands[cnt][2]-1];
			cnt++;
		}
		//입력
	}
}
