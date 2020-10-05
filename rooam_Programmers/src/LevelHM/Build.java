package LevelHM;

public class Build {

	public static void main(String[] args) {
		int[][] ground = { { 1, 0, 0, 0, 0, 1, 0 }, { 0, 0, 0, 0, 1, 1, 0 }, { 0, 0, 0, 0, 0, 0, 1 },
				{ 1, 0, 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 0, 0, 0 }};
		int[][] build = { { 1, 1}, { 1, 1 }, { 1, 1 }, { 1, 1 }, { 1, 1 } };// 2 넓이에 층 수 상관없는 소스

		int[] empty = new int[(ground.length * 10) + ground[0].length + 1];// 인덱스 좌표저장
		int cIndex = 0;
		int lIndex = 0;
		int ccnt = 0;
		int lcnt = 0;
		int answer = 0;

		for (int i = 0; i < ground.length; i++) {
			for (int j = 0; j < ground[i].length; j++) {
				if (ground[i][j] == 0) {
					empty[(i * 10) + j] = 1;
				} else {
					empty[(i * 10) + j] = 0;
				}
			}
		}

		for (int i = 0; i < empty.length; i++) {
			cIndex = i;
			lIndex = i;
			ccnt = 1;
			lcnt = 0;
			if (empty[i] == 1) {
				for (int j = 0; j < build.length * build[0].length - 1; j++) {// 건물 부지 한개는 확보 세로 확인
					if (j % 2 == 0) {
						cIndex = cIndex + 1;
					} else {
						cIndex = cIndex + 9;
					}
					if (empty[cIndex] == 1) {
						ccnt++;
					} else {
						break;
					}

					if (ccnt == build.length * build[0].length) {
						answer++;
					}
				}
				for (int k = 0; k < build.length * build[0].length / 2; k++) {// 가로 확인
					if (empty[lIndex] == 1) {
						lcnt++;
					} else {
						break;
					}
					if (empty[lIndex + 10] == 1) {
						lcnt++;
					} else {
						break;
					}
					lIndex = lIndex + 1;
					if (lcnt == build.length * build[0].length) {
						answer++;
					}
				}
			}
		}

		System.out.println(answer);

		for (int i = 0; i < empty.length; i++) {
			if (empty[i] == 1) {
				if (i < 10) {
					System.out.print("0" + i + " " + empty[i]);
					System.out.println();
				} else {
					System.out.print(i + " " + empty[i]);
					System.out.println();
				}
			}
		}
		for (int i = 0; i < ground.length; i++) {
			for (int j = 0; j < ground[i].length; j++) {
				System.out.print(ground[i][j] + " ");
			}
			System.out.println();
		}

	}

}
