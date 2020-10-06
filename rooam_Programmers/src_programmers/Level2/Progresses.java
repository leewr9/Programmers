package Level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Progresses {

	public static void main(String[] args) {
		Queue<Integer> ps = new LinkedList<Integer>();
		ArrayList<Integer> al = new ArrayList<>();
		int[] progresses = { 93, 30, 55 };
		int[] speeds = { 1, 30, 5 };
		int[] pss = new int[progresses.length];
		int day = 0;// 최대작업기간 100일

		for (int i = 0; i < progresses.length; i++) {
			ps.offer(progresses[i]);
		}

		while (!ps.isEmpty()) {
			for (int i = 0; i < progresses.length; i++) {
				if (pss[i] == 0) {
					pss[i] = progresses[i] + speeds[i];
				} else if (pss[i] < 100) {
					pss[i] = pss[i] + speeds[i];
				}
			}

			for (int i = 0; i < pss.length; i++) {
				if (i > 0) {
					if (progresses[i - 1] == 0 && ps.peek() == progresses[i] && pss[i] >= 100) {
						progresses[i] = 0;
						ps.poll();
						day++;
					}
				} else {
					if (ps.peek() == progresses[i] && pss[i] >= 100) {
						progresses[i] = 0;
						ps.poll();
						day++;
					}
				}
			}

			if (day != 0) {
				al.add(day);
				day = 0;
			}
		}

		int[] answer = new int[al.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = al.get(i);
		}
	}

}
