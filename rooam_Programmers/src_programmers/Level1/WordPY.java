package Level1;

public class WordPY {

	public static void main(String[] args) {
		String s = "pPY";
		int pNum = 0;
		int yNum = 0;
		boolean answer = true;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
				pNum++;
			} else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
				yNum++;
			}
		}
		
		if (pNum - yNum == 0) {
			answer = true;
		} else {
			answer = false;
		}
		
		System.out.println(answer);
	}
}
