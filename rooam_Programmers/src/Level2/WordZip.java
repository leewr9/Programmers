package Level2;

public class WordZip {

	public static void main(String[] args) {
		String s = "abcabcabcabcdededededede";
		int answer = 0;

		String[] sNum = new String[s.length()];// ����
		String[] div = new String[s.length()];
		String wNum = "";
		String word = "";

		int[] zipLength = new int[s.length()];// ���ະ����
		int index = 0;
		int dIndex = 0;
		int sIndex = 0;
		int cnt = 1;

		for (int str = 1; str <= s.length(); str++) {
			div = new String[s.length()];
			wNum = "";
			word = "";
			
			sIndex = str;
			dIndex = 0;
			cnt = 1;
			
			for (int i = 0; i < s.length();) {
				if (sIndex < s.length()) {
					div[dIndex] = s.substring(i, sIndex);
					dIndex++;
				} else {
					div[dIndex] = s.substring(i);
				}
				i = sIndex;
				sIndex = sIndex + str;
			} // ������ �������

			for (int i = 0; i < div.length; i++) {
				if (div[i] != null) {
					wNum = div[i];
					if (i < div.length - 1 && div[i].equals(div[i + 1])) {
						if (i > 0 && div[i].equals(div[i - 1])) {
							cnt++;
						} else {
							cnt = 2;
						}
					} else {
						if (cnt > 1) {
							wNum = Integer.toString(cnt) + div[i];
							word = word + wNum;
							wNum = "";
							cnt = 1;
						} else {
							word = word + wNum;
							wNum = "";
						}
					}
				}
				if (i == div.length && div[i] != null && div[i].equals(div[i - 1])) {
					word = word + div[i];
				}
			} // ������ ������ ����

			zipLength[index] = word.length();
			sNum[index] = word;
			index++;
		}

		answer = zipLength[0];// ���� ����

		for (int i = 0; i < zipLength.length; i++) {
			if (answer > zipLength[i]) {
				answer = zipLength[i];
			}
		}
	}
}
