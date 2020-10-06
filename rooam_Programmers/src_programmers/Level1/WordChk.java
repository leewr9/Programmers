package Level1;

public class WordChk {

	public static void main(String[] args) {
		String s = "a234";
		int cnt = 0;
		boolean answer = true;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				cnt++;
			}else{
                cnt = 0;
                break;
			}
		}

		if (cnt == 4 || cnt == 6) {
			answer = true;
		} else {
			answer = false;
		}
		System.out.println(answer);
	}
}
