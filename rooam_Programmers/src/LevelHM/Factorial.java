package LevelHM;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(factorial(10));
	}

	public static int factorial(int f) {
		if (f == 1) {//������ �������� ���� �극��ũ 1���� �������� ��� ���� ���� ���Ͻ�Ű�� 1�� �Ǹ� ����
			return 1;
		} else {
			return f + factorial(f - 1);
			// 4 3 2 1
		}
	}
}
