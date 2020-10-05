package Level1;

public class ArraySum {

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2 }, { 2, 3 } };
		int[][] arr2 = { { 3, 4 }, { 5, 6 } };
		int[][] answer = new int[arr1.length][arr1[0].length];

		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer[i].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
	}
}
