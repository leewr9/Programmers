package Level2;

import java.util.LinkedList;
import java.util.Queue;

public class Strok {

	public static void main(String[] args) {
		Queue<Integer> stork = new LinkedList<Integer>();
		int[] prices = { 1, 2, 3, 2, 3 };
		int[] answer = new int[prices.length];
		int s = 0;
		for (int i = 0; i < prices.length; i++) {
			stork.offer(prices[i]);
		}
		while (!stork.isEmpty()) {
			int day = 0;
			for (int i = s; i < prices.length; i++) {
				if (stork.peek() > prices[i]) {
					answer[s] = day;
					stork.poll();
					break;
				} else {
					if (i == prices.length - 1) {
						answer[s] = day;
						stork.poll();
						break;
					}
				}
				day++;
			}
			s++;
		}
	}
}
