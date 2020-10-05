package Level1;

public class MaxMin {

	public static void main(String[] args) {
		long n = 3;
		long m = 12;
		int save = 0;
		int[] answer = new int[2];

		if (n > m) {
			save = (int) n;
			n = m;
			m = save;
		}

		int[] nNum = new int[(int) (n + 1)];
		int[] nMum = new int[(int) ((n * m) + 1)];
		int[] mNum = new int[(int) (m + 1)];
		int[] mMum = new int[(int) ((n * m) + 1)];

		for (int i = 1; i <= n * m; i++) {
			if (n % i == 0) {
				nNum[i] = 1;// 약수
			}
			if (i * n <= n * m) {
				nMum[(int) (i * n)] = 2;// 배수
			}
		}

		for (int i = 1; i <= n * m; i++) {
			if (m % i == 0) {
				mNum[i] = 1;// 약수
			}
			if (i * m <= n * m) {
				mMum[(int) (i * m)] = 2;// 배수
			}
		}

		for (int i = 1; i <= n * m; i++) {
			if (i <= n && nNum[i] == 1 && mNum[i] == 1) {
				answer[0] = i;
			}
			if (nMum[i] == 2 && mMum[i] == 2) {
				answer[1] = i;
				break;
			}
		}
		System.out.println(answer[0]);
		System.out.println(answer[1]);
	}
}
