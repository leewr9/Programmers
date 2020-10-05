package Level1;

public class Ceaser {

	public static void main(String[] args) {
		// 대문자6590 소문자97122
		int n = 25; 
		String s = "a B z a n Z G";
		String answer = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 32) {
				if (s.charAt(i) < 97) {
					if (s.charAt(i) + n > 90) {
						answer = answer + (char) (((s.charAt(i) + n -90) + 64));
					} else {
						answer = answer + (char) (s.charAt(i) + n);
					}
				} else {
					if (s.charAt(i) + n > 122) {
						answer = answer + (char) (((s.charAt(i) + n -122) + 96));
					} else {
						answer = answer + (char) (s.charAt(i) + n);
					}
				}
			} else {
				answer = answer + s.charAt(i);
			}
		}
		System.out.println(answer);
	}
}
