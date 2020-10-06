package Level2;

public class TruePare {

	public static void main(String[] args) {
		String s = ")()(";
		boolean answer = true;

		int cnt = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				cnt++;
			} else {
				cnt--;
			}
			if(cnt < 0) {
				break;
			}
		}
		if (cnt != 0) {
			answer = false;
		}
		
		System.out.println(answer);

	}
}
