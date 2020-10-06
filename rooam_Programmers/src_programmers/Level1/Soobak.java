package Level1;

public class Soobak {

	public static void main(String[] args) {
		int n = 100;
		char s = '¼ö';
		char b = '¹Ú';
		String sb = "";
		for (int i = 0; i < n; i++) {
			if(i%2==0) {
				sb=sb+s;
			}else {
				sb=sb+b;
			}
		}
		
		System.out.println(sb);

	}
}
