package Level1;

public class ArrayRet {

	public static void main(String[] args) {
		long n = 2000000000;

		String nString = String.valueOf(n);
		int[] nRev = new int[nString.length()];
		int nNum = 0;

		for (int i = nString.length() - 1; i >= 0; i--) {
			nRev[nNum] = Integer.valueOf(nString.charAt(i)-48);
			nNum++;
		}

		for (int i = 0; i < nRev.length; i++) {

			System.out.println(nRev[i]);
		}

	}
}
