package LevelHM;

public class OddNum {

	public static void main(String[] args) {
		System.out.println(odd(1, 100, 0));//1부터 100, 카운트 시작점
	}

	public static int odd(int o, int m, int c) {
		if (o > m) {
			return c;
		} else {
			c++;
			o += 2;
			return odd(o, m, c);
		}
	}
}
