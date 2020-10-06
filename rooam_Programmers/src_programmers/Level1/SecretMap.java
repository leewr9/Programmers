package Level1;

public class SecretMap {

	public static void main(String[] args) {
		int n = 10;
		int[] arr1 = { 9, 20, 28, 18, 11, 9, 20, 28, 300, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28, 9, 20, 28, 18, 11 };
		String[] answer = new String[n];
		String one = "";//arr1 2진수
		String two = "";//arr2 2진수
		String a = "";//합치기
		for (int j = 0; j < n; j++) {
			one = "";
			two = "";
			a = "";

			while (arr1[j] != 0) {
				one = String.valueOf(arr1[j] % 2) + one;
				arr1[j] = arr1[j] / 2;
			}
			while (arr2[j] != 0) {
				two = String.valueOf(arr2[j] % 2) + two;
				arr2[j] = arr2[j] / 2;
			}
			if (one.length() < n) {
				while (n - one.length() != 0) {
					one = "0" + one;
				}
			}
			if (two.length() < n) {
				while (n - two.length() != 0) {
					two = "0" + two;
				}
			}
			for (int i = 0; i < n; i++) {
				if (one.charAt(i) == two.charAt(i)) {
					if (one.charAt(i) == '1') {
						a += "#";
					} else {
						a += " ";
					}
				} else {
					a += "#";
				}
			}

			answer[j] = a;
		}

		for (int j = 0; j < n; j++) {
			System.out.print(answer[j]);
			System.out.println();
		}

	}
}
