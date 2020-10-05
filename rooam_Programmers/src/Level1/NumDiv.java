package Level1;

public class NumDiv {

	public static void main(String[] args) {
		int[] arr = { 2, 36, 1, 3 };
		int divisor = 1;

		int[] answer = new int[arr.length];
		int size = 0;
		int save = 0;
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				size++;
			}
		}

		if (size == 0) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[size];
			size = 0;

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % divisor == 0) {
					answer[size] = arr[i];
					size++;
				}
			}
			
			arr = new int[answer.length];
			
			for(int i=0; i<arr.length; i++) {
				arr[i]=answer[i];
			}
			
			for (int i = answer.length - 1; i >= 0; i--) {
				save = 0;
				for (int j = 0; j < arr.length; j++) {
					if (save <= arr[j]) {
						save = arr[j];
						index = j;
					}
				}
				answer[i] = save;
				arr[index] = 0;
			}
		}


	}
}
