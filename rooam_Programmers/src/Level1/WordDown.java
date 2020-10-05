package Level1;

public class WordDown {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		
		String down="";
		char[] sChar = new char[s.length()];
		char save = 0;

		int dNum = 0;
		int sNum = 0;

		for(int i=0; i<s.length(); i++) {
			sChar[i]=s.charAt(i);
		}
		
		while (down.length()<s.length()) {
			if (save < sChar[dNum]) {
				save = sChar[dNum];
				sNum = dNum;
			}
			
			if (dNum + 1 == sChar.length) {
				sChar[sNum]=0;
				down=down+save;
			}

			dNum++;

			if (dNum == sChar.length) {
				save = 0;
				sNum = 0;
				dNum = 0;
			}
		}

		System.out.println(down);
	}
}
