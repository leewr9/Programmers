package Level2;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();// 순서
		Queue<Integer> iueue = new LinkedList<>();// 로케이션 번호
		int[] priorities = { 1, 1, 1, 9, 1, 1, 8, 1, 1, 3};
		int location = 8;
		int answer = 0;

		int idx = 0;
		int max = 0;
		int brk = 0;
		
		for (int i = 0; i < priorities.length; i++) {
			queue.add(priorities[i]);
			iueue.add(i);
		}
		
		while (brk < priorities.length) {
			max = 0;
			idx = 0;
			for (int i = 0; i < priorities.length; i++) {
				if (max < priorities[i]) {
					max = priorities[i];
					idx = i;
				}
			}

			while (max != queue.peek()) {
				queue.add(queue.poll());
				iueue.add(iueue.poll());
			}
			
			if (location == iueue.peek()) {
				answer = brk + 1;
				break;
			}

			queue.poll();
			iueue.poll();
			priorities[idx] = 0;

			brk++;
		}

		System.out.println(answer);

	}
}
