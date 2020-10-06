package Array;

public class Insertion {

	public static void main(String[] args) {
		int[] array = { 5, 3, 8, 1, 2, 7 };
		int save = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < i; j++) {
				if (array[i] < array[j]) {
					save = array[i];
					array[i] = array[j];
					array[j] = save;
				}
			}
			
			for(int k = 0; k<array.length; k++) {
				System.out.print(array[k]+" ");
			}
			System.out.println();
		}
		
	}
}
