package Level2;

public class MNum {

	public static void main(String[] args) {
		int[] numbers = { 2, 7777, 888, 9999 };// 3 30 34 9 5 9534330
		String answer = "";
		int index = 0;
		double save = 0;// ÃÖ´ñ°ª
		double max = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] >= 10) {
					save = numbers[j];
					while (save > 10) {
						save = save / 10;
					}
					if (max < save) {
						max = save;
						index = j;
					}
				} else {
					if (max < numbers[j]) {
						max = numbers[j];
						index = i;
					}
				}
			}
			System.out.println(index);
			answer = String.valueOf(numbers[index]) + answer;
			numbers[index] = 0;
			max = 0;
		}
		
		System.out.println(answer);
	}
}
