package LevelHM;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(factorial(10));
	}

	public static int factorial(int f) {
		if (f == 1) {//리턴의 조건으로 인해 브레이크 1까지 내려가며 계속 더한 값을 리턴시키다 1이 되며 정지
			return 1;
		} else {
			return f + factorial(f - 1);
			// 4 3 2 1
		}
	}
}
