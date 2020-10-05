package Level2;

import java.util.HashMap;

public class ZipWord {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		String msg = "KAKAO";
		int[] answer;

		char zip = 'A';
		int index = 0;
		int cnt = 0;
		int[] array = new int[msg.length()];

		for (int i = 0; i < 26; i++) {
			hm.put(String.valueOf(zip), i + 1);
			zip++;
			index = i + 1;
		}

		for (int i = 0; i < msg.length(); i++) {
			for (int j = msg.length(); j >= i; j--) {
				if (hm.containsKey(msg.substring(i, j))) {
					index++;
					array[i] = hm.get(msg.substring(i, j));
					cnt++;
					if (j < msg.length()) {
						hm.put(msg.substring(i, j + 1), index);
					}
					if (j - i > 1) {
						i = i + msg.substring(i, j).length() - 1;
					}
					break;
				}
			}
		}
		answer = new int[cnt];
		index = 0;

		for (int i : array) {
			if (i != 0) {
				answer[index] = i;
				index++;
			}
		}
		
		System.out.println(answer.length);

	}
}
