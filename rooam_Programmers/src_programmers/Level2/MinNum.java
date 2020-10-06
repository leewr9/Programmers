package Level2;

import java.util.Arrays;

public class MinNum {

	public static void main(String[] args) {
		int[] A = { 6, 8, 3, 7 };
		int[] B = { 10, 4, 5, 9 };
		int answer = 0;

		Arrays.sort(A);
		Arrays.sort(B);

		for (int i = 0; i < A.length; i++) {
			answer += A[i] * B[B.length - i - 1];
		}

		System.out.println(answer);
	}
}
