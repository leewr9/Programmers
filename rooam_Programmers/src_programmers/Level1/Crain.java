package Level1;

public class Crain {

	public static void main(String[] args) {
		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };// 크레인 인형
		int[] c = new int[board.length * board[0].length];// 담을 배열
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		// [1,5,3,5,1,2,1,4]순서
		// [4,3,1,1,3,2,4]
		int b = 0;// 담을 배열 인덱스값
		int m = 0;// 움직일 인덱스값
		int cnt = 0;
		for (;;) {
			for (int i = 0; i < board.length; i++) {
				if (board[board.length - 1][moves[m] - 1] == 0) {
					break;
				}
				if (board[i][moves[m] - 1] != 0) {
					c[b] = board[i][moves[m] - 1];
					board[i][moves[m] - 1] = 0;
					b++;
					break;
				}
			}
			if (b > 1 && c[b - 1] == c[b - 2]) {
				c[b - 1] = 0;
				c[b - 2] = 0;
				cnt = cnt + 2;
				b = b - 2;
			}
			m++;
			if (m == moves.length) {
				break;
			}
		}
	}
}
