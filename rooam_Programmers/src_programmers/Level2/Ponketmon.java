package Level2;

import java.util.HashSet;

public class Ponketmon {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		int[] nums = { 1, 1, 1, 1 };
		int answer = 0;
		int size = nums.length / 2;

		for (int i : nums) {
			set.add(i);
		}

		if (set.size() != size) {
			if(size > set.size()) {
				answer = set.size();
			}else {
				answer = size;
			}
		} else {
			answer = set.size();
		}

		System.out.println(answer);

	}

}
