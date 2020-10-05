package Level1;

import java.util.Arrays;

public class WordIdx {

	public static void main(String[] args) {
		String[] strings = { "abce", "abcd", "cdx" };
		int n = 2;

		String[] chars = new String[strings.length];
		char save = 0;
		int index = 0;

//		for (int i = 0; i < strings.length; i++) {
//			chars[i] = strings[i];
//		}

		Arrays.sort(chars);

		for (int i = strings.length - 1; i >= 0; i--) {
			save = 0;
			index = 0;
			for (int j = 0; j < chars.length; j++) {
				if (chars[j] != null) {
					if (save <= chars[j].charAt(n)) {
						save = chars[j].charAt(n);
						index = j;
					}
				}
			}
			strings[i] = chars[index];
			chars[index] = null;
		}

		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}

	}
}
