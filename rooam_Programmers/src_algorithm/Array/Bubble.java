package Array;

public class Bubble {

	public static void main(String[] args) {
		int[] array = { 5, 3, 8, 1, 2, 7 };
		int save = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (j < array.length - 1 && array[j] > array[j + 1]) {
					save = array[j];
					array[j] = array[j + 1];
					array[j + 1] = save;
				}
			}
			for(int k = 0; k<array.length; k++) {
				System.out.print(array[k]+" ");
			}
			System.out.println();
		}
	}
}
