package Level1;

public class AnotherWord {
	public static void main(String[] args) {
		String s = " try  hellod world   ";
		String[] sp = s.split(" ", -1);
		// 6590 //97122

		System.out.println(sp.length);
		String answer = "";
		for (int i = 0; i < sp.length; i++) {
			for (int j = 0; j < sp[i].length(); j++) {
					if (j % 2 == 0) {
						if (sp[i].charAt(j) < 97) {
							answer = answer + (char) sp[i].charAt(j);
						} else {
							answer = answer + (char) (sp[i].charAt(j) - 32);
						}
					} else {
						if (sp[i].charAt(j) > 96) {
							answer = answer + (char) sp[i].charAt(j);
						} else {
							answer = answer + (char) (sp[i].charAt(j) + 32);
						}
					}
			}
			
			if (i < sp.length-1) {
				answer = answer + " ";
			}
		}

		System.out.println(answer);

	}
}
