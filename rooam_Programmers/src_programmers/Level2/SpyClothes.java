package Level2;

import java.util.HashMap;

public class SpyClothes {
	public static void main(String[] args) {
		HashMap<String, Integer> clt = new HashMap<String, Integer>();

		String[][] clothes = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
				{ "green_turban", "headgear" }, { "yellow_hat", "head" }, { "green_turban", "eyewear" },
				{ "yellow_hat", "head" }, { "green_turban", "head" } };
		int answer = 0;
		int[] cnt;
		int cIndex = 0;
		int sum = 0
		int save = 0;

		for (int i = 0; i < clothes.length; i++) {
			answer++;
			if (clt.containsKey(clothes[i][1])) {
				clt.put(clothes[i][1], clt.get(clothes[i][1]) + 1);
				clothes[i][1] = null;
			} else {
				clt.put(clothes[i][1], 1);
			}
		}

		cnt = new int[clt.size()];
		for (int j = 0; j < clothes.length; j++) {
			if (clothes[j][1] != null) {
				cnt[cIndex] = clt.get(clothes[j][1]);
				clt.remove(clothes[j][1]);
				cIndex++;
			}
		} // 경우의 수 계산을 위한 정수배열 입력

		for (int i = 0; i < cnt.length; i++) {
			int index = i + 1;
			sum = 0;
			while (index < cnt.length) {
				save = cnt[i] * cnt[index];
				sum += save;
				System.out.println("save" + save);
				System.out.println(sum);
				answer += save;
				index++;
			}
		}
		answer += sum;

		System.out.println(answer);
	}
}
