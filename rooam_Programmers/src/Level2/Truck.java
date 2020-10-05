package Level2;

import java.util.LinkedList;
import java.util.Queue;

public class Truck {

	public static void main(String[] args) {
		Queue<Integer> b = new LinkedList<Integer>();
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = { 7, 4, 5, 6 };
		int answer = 0;// 일 수

		int[] tcnt = new int[truck_weights.length];
		int tr = 0;// 차 순서
		int brk = 0;// 차가 없을 경우 멈출 변수

		for (int i = 0; i < tcnt.length; i++) {
			tcnt[i] = -1;
		}

		while (brk == 0) {
			if (tr < truck_weights.length && weight >= truck_weights[tr]) {
				weight = weight - truck_weights[tr];
				tcnt[tr] = bridge_length;
				b.offer(truck_weights[tr]);
				tr++;
			}
			for (int i = 0; i < tcnt.length; i++) {
				if (tcnt[i] > 0) {
					brk = 0;
					break;
				} else {
					brk = 1;
				}
			}
			for (int i = 0; i < tr; i++) {
				if (tcnt[i] >= 0) {
					tcnt[i]--;
				}
				if (tcnt[i] == 0) {
					weight = weight + truck_weights[i];
					b.poll();
				}
			}
			answer++;
		}
		System.out.println(answer);
	}
}
