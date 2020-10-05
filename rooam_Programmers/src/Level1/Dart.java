package Level1;

public class Dart {

	public static void main(String[] args) {
		String dartResult = "30S2S3S";
		int answer = 0;
		String[] sp = null;
		int length = dartResult.length();
		int logic = 0;
		int save = 0;

		for (int i = 0; i < length + 2; i++) {
			if (dartResult.charAt(i) >= 65 && dartResult.charAt(i) <= 90) {
				if (dartResult.charAt(i + 1) == '*' || dartResult.charAt(i + 1) == '#') {
					dartResult = dartResult.substring(0, i + 2) + " " + dartResult.substring(i + 2);
				} else {
					dartResult = dartResult.substring(0, i + 1) + " " + dartResult.substring(i + 1);
				}
				System.out.println(dartResult);
			}
			if (dartResult.length() == length + 2) {
				break;
			}
		} // 나누기 위해 칸나누기
		sp = dartResult.split(" ");// 점수별 나누기

		for (int i = 0; i < sp.length; i++) {
			logic = 0;
			for (int j = 0; j < sp[i].length(); j++) {
				switch (sp[i].charAt(j)) {
				case 'S':
					break;
				case 'D':
					logic = logic * logic;
					break;
				case 'T':
					logic = logic * logic * logic;
					break;
				case '*':
					logic = logic * 2;
					answer = answer + save;
					break;
				case '#':
					logic = logic - (logic * 2);
					break;
				default:
					logic = sp[i].charAt(j) - 48;
					if (sp[i].charAt(j + 1) >= 48 && sp[i].charAt(j + 1) <= 57) {
						logic = (logic * 10) + (sp[i].charAt(j + 1) - 48);
						j++;
					}
				}

			}
			save = logic;
			answer = answer + logic;
		}
		System.out.println(answer);

	}
}
