package Level1;

import java.util.HashMap;

public class Maraton {

	public static void main(String[] args) {
		HashMap<String, Integer> pHM = new HashMap<String, Integer>();
		String[] participant = { "mislav", "stanko", "mislav", "ana" };
		String[] completion = { "stanko", "ana", "mislav" };
		String answer = "";

		for (String start : participant) {
			pHM.put(start, pHM.getOrDefault(start, 0) + 1);
		}
		for (String finish : completion) {
			pHM.put(finish, pHM.get(finish) - 1);
		}
		for (String ans : pHM.keySet()) {
			if (pHM.get(ans) > 0) {
				answer = ans;
			}
		}
		System.out.println(answer);

	}
}
