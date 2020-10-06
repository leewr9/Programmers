package Level2;

public class Pibonachi {

	public static void main(String[] args) {
		int n = 3; // 0 1 1 2 3 5 8 13 21 34
		int div = 1234567;
		long last = 1;// 시작
		long next = 1;// 다음
		long pbnc = 0;// 결과

		if (n == 0) {
			pbnc = 0;
		} else if (n == 1 || n == 2) {
			pbnc = 1;
		} else {
			for (int i = 0; i < n - 2; i++) {
				pbnc = (last % div) + (next % div);
				last = next % div;
				next = pbnc % div;
			}
		}
		int answer = (int) pbnc % div;
		System.out.println(answer);
	}

}
