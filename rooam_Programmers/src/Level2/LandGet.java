package Level2;

public class LandGet {

	public static void main(String[] args) {
		int[][] land = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
		int save = 0;
		int sum = 0;
		int index = 0
		while (true) {
			save = 0;
			index = 0;
			
			for (int i = 0; i < land[0].length; i++) {
				if (land[0][i] > save) {
					save = land[0][i];
					index = i;
				}
			}
			
			land[0][index] = -1;

			for (int i = 1; i < land.length; i++) {
				for (int j = 0; j < land[i].length; j++) {
					 	
				}
			}
			break;
		}

		for (int i = 0; i < land.length; i++) {
			for (int j = 0; j < land[i].length; j++) {
				System.out.print(land[i][j]);
			}
			System.out.println();
		}
	}

}
