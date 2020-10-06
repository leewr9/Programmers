package Level1;

public class NumSum {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		long answer = 0;
		
		if(a-b>=0){
			for(int i=a; i>=b; i--) {
				answer=answer+i;
			}
			System.out.println(answer);
		}else {
			for(int i=a; i<=b; i++) {
				answer=answer+i;
			}
		}
		
		
	}
}
