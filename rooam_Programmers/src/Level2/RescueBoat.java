package Level2;

import java.util.Arrays;

public class RescueBoat {

	public static void main(String[] args) {
		int[] people = { 90, 10, 20, 80, 30, 40, 50, 60, 70 };
		int limit = 100;
		int answer = 0;

		int sum = 0;
		int index = people.length - 1;
		int start = 0;
		Arrays.sort(people);

		while (index > start - 1) {
			sum = people[index];

			for (int j = start; j < people.length; j++) {
				if (sum + people[j] <= limit) {
					start = j + 1;
					answer++;
					sum = limit + 1;
					break;
				} else if (sum + people[j] > limit) {
					answer++;
					break;
				}
			}
			if (sum < limit) {
				answer++;
			}
			index--;
		}
		System.out.println(answer);
	}
}
