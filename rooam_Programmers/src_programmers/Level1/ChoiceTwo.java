package Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class ChoiceTwo {

	public static void main(String[] args) {
		ArrayList<Integer> ary = new ArrayList<>();
		int[] numbers = { 0, 0, 0 };
		int sum = 0;
		int index = 0;
		int array = 0;

		while (index < numbers.length) {
			for (int i = index + 1; i < numbers.length; i++) {
				sum = numbers[index] + numbers[i];
				for (int j : ary) {
					if (j == sum) {
						sum = -1;
						break;
					}
				}
				if (sum != -1) {
					ary.add(sum);
				}
			}
			index++;
		}

		int[] answer = new int[ary.size()];

		for (int i : ary) {
			answer[array] = i;
			array++;
		}

		Arrays.sort(answer);

		for (int i : answer) {
			System.out.println(i);
		}
	}
}
