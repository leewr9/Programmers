package Level2;

public class Joystick {

	public static void main(String[] args) {
		String name = "AAB";
		int answer = 0;
		
		int[] array = new int[name.length()];
		int right = 0;
		int left = 0;

		int index = 0;
		int lcnt = 0;
		int rcnt = 0;
		int brk = 0;

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) < 78) {
				array[i] = name.charAt(i) - 65;
			} else {
				array[i] = 91 - name.charAt(i);//
			}
		} // 배열 입력 N을 기준으로 위 아래
		
		answer += array[index];
		array[index] = 0;

		while (brk > -1) {
			lcnt = 0;
			rcnt = 0;

			right = index;
			while (true) {
				if (right == array.length - 1) {
					right = -1;
				}
				right++;
				rcnt++;
				if (right == array.length - 1 || array[right] != 0) {
					if (array[right] != 0) {
						break;
					} else if (right != array.length - 1) {
						right = -1;
					}
				}
			}

			left = index;
			while (true) {
				if (left == 0) {
					left = array.length;
				}
				left--;
				lcnt++;
				if (left == 0 || array[left] != 0) {
					if (left == 0) {
						left = array.length;
					} else {
						break;
					}
				}
			}

			if (rcnt > lcnt) {
				index = left;
				answer += lcnt;
			} else {
				index = right;
				answer += rcnt;
			}

			answer += array[index];
			array[index] = 0;
			
			for (int i = 0; i < array.length; i++) {
				if (array[i] == 0) {
					brk = -1;
				} else {
					brk = 0;
					break;
				}
			}
		}
		System.out.println(answer);

	}
}
