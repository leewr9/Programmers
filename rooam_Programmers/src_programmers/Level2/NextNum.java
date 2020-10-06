package Level2;

public class NextNum {

	public static void main(String[] args) {
		int n = 78;
		int save = n;
		int cnt = 0;
		int snt = 0;

		while (save > 0) {
			if (save % 2 == 1) {
				cnt++;
			}
			save = save / 2;
		}

		while (true) {
			snt = 0;
			save = n + 1;
			n = n + 1;
			while (save > 0) {
				if (save % 2 == 1) {
					snt++;
				}
				save = save / 2;
			}
			if(snt == cnt) {
				break;
			}
		}
	}
}
