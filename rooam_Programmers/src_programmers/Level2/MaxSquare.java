package Level2;

public class MaxSquare {

	public static void main(String[] args) {
		int[][] board = { { 0, 1, 1, 1 }, { 0, 0, 1, 1 }, { 1, 1, 1, 1 }, { 0, 0, 1, 0 } };
		int[] cnt = new int[board.length];
		int[] not = new int[board.length];
		int count = 1;

		for (int i = 0; i < cnt.length; i++) {
			count = 1;
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 1) {
					cnt[i] = cnt[i] + count;
				}else {
					not[i] = not[i] + count;
				}
				count = count + 2;
			}
		}
		
		for(int i =0; i<cnt.length; i++) {
			System.out.println(i+" "+cnt[i])
			System.out.println(i+" "+not[i]);
		}

	}
}
