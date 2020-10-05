package Level1;

public class ArrayNum {

	public static void main(String[] args) {
		int n = 123;
		int answer = 0;
		int nNum = 0;

		while (true) {
			nNum=n%10;
			answer=answer+nNum;
			n=n/10;
			
			if(n==0) {
				break;
			}
		}
		System.out.println(answer);

	}
}
