package Level2;

public class JadenCase {

	public static void main(String[] args) {
		String s = "3people unFollowed me";
		String answer = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 32) {
				if (i == 0) {
					if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
						answer += String.valueOf((char) (s.charAt(i) - 32));
					} else {
						answer += String.valueOf(s.charAt(i));
					}
				} else {
					if (s.charAt(i - 1) == 32) {
						if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
							answer += String.valueOf((char) (s.charAt(i) - 32));
						} else {
							answer += String.valueOf(s.charAt(i));
						}
					} else {
						if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
							answer += String.valueOf(s.charAt(i));
						} else {
							answer += String.valueOf((char) (s.charAt(i) + 32));
						}
					}
				}
			} else {
				answer += " ";
			}
		}
		System.out.println(answer);

	}
}
