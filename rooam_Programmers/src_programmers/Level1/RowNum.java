package Level1;

public class RowNum {

	public static void main(String[] args) {
		int[] arr = { 5, 1, 2, 6, 8 };
		int[] answer = new int[arr.length - 1];
		int save = 0;
		int index = 0;

		if (arr.length == 1) {
			answer = new int[1];
			answer[0] = -1;
		} else {

			for (int j = 0; j < arr.length; j++) {
				if (save < arr[j]) {
					save = arr[j];
				}
			} // ÃÖ´ë¼ö

			for (int j = 0; j < arr.length; j++) {
				if (save > arr[j]) {
					save = arr[j];
					index = j;
				}
			}
			arr[index] = 0;
			index = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] != 0) {
					answer[index] = arr[j];
					index++;
				}
			}
		}

		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}

	}
}
