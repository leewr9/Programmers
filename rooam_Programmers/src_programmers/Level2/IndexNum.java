package Level2;

public class IndexNum {

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] arr2 = { { 1, 4 }, { 2, 5 }, { 3, 6 } };// 1432 3277
		int[][] answer = new int[arr1.length][arr2[0].length];
		int index = 0;
		int sum = 0;

		while (index < answer.length) {
			
			for (int i = 0; i < arr2[0].length; i++) {
				for (int j = 0; j < arr2.length; j++) {
					sum = arr2[j][i] * arr1[index][j];
					answer[index][i] += sum;
				}
			}
			index++;
			
		}

		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer[i].length; j++) {

				System.out.print(answer[i][j]);
			}
			System.out.println();
		}
	}
}
