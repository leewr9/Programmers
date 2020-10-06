package Level1;

public class XNum {

	public static void main(String[] args) {
		int x = -4;
		int n = 2;
		long[] answer = new long[n];
		
		for (int i = 0; i < n; i++) {
			answer[i] = Long.valueOf(x * (i + 1));
		}
		
	}
}
