package Level1;
public class Keypad {
	public static void main(String[] args) {
		int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		String hand = "right";
		String answer = "";
		int[][] point = { { 0, 0 }, { 0, 0 }, { 0, 1 }, { 0, 2 }, { 1, 0 }, { 1, 1 }, { 1, 2 }, { 2, 0 }, { 2, 1 },
				{ 2, 2 }, { 3, 0 }, { 3, 1 }, { 3, 2 } };
		int[] lPoint = { point[10][0], point[10][1] };
		int[] rPoint = { point[11][0], point[11][1] };

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				numbers[i] = 11;
			}
			if (numbers[i] % 3 == 0) {
				answer += "R";
				rPoint[0] = point[numbers[i]][0];
				rPoint[1] = point[numbers[i]][1];
			} else if (numbers[i] % 3 == 1) {
				answer += "L";
				lPoint[0] = point[numbers[i]][0];
				lPoint[1] = point[numbers[i]][1];
			} else if ((numbers[i] % 3 == 2)) {
				int lNum = Math.abs(point[numbers[i]][0] - lPoint[0]) + Math.abs(point[numbers[i]][1] - lPoint[1]);
				int rNum = Math.abs(point[numbers[i]][0] - rPoint[0]) + Math.abs(point[numbers[i]][1] - rPoint[1]);
				if (lNum > rNum) {
					answer += "R";
					rPoint[0] = point[numbers[i]][0];
					rPoint[1] = point[numbers[i]][1];
				} else if (lNum < rNum) {
					answer += "L";
					lPoint[0] = point[numbers[i]][0];
					lPoint[1] = point[numbers[i]][1];
				} else if (lNum == rNum) {
					if(hand.equals("right")) {
						answer += "R";
						rPoint[0] = point[numbers[i]][0];
						rPoint[1] = point[numbers[i]][1];
					}else if(hand.equals("left")) {
						answer += "L";
						lPoint[0] = point[numbers[i]][0];
						lPoint[1] = point[numbers[i]][1];
					}
				}

			}
		}
		System.out.println(answer);
	}
}
