package Array;

public class Selection {

	public static void main(String[] args) {
		int[] array = { 5, 3, 8, 1, 2, 7 };
		int save = 10;//ÃÖ´ñ°ª
		int index = 0;
		
		for (int i = 0; i < array.length; i++) {
			save = 10;
			for (int j = i; j < array.length; j++) {
				if (save > array[j]) {
					save = array[j];
					index = j;
				}
			}
			array[index] = array[i];
			array[i] = save;
			
			for(int k = 0; k<array.length; k++) {
				System.out.print(array[k]+" ");
			}
			System.out.println();
			
		}
		
	}

}
