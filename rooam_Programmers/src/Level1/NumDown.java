package Level1;

public class NumDown {

	public static void main(String[] args) {
		long n = 118372;
		long answer = 0;

		char[] nChar = String.valueOf(n).toCharArray();
		String ans = "";
		char save = 0;
		int sNum = 0;

		for (int i = 0; i < nChar.length; i++) {
			sNum = 0;
			save = 0;
			for (int j = 0; j < nChar.length; j++) {
				if (save < nChar[j]) {
					save = nChar[j];
					sNum = j;
				}
			}
			ans = ans + save;
			nChar[sNum] = 0;
		}
		
		answer=Long.valueOf(ans);
		System.out.println(answer);

	}
}
