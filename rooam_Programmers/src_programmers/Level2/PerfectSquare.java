package Level2;

public class PerfectSquare {

	public static void main(String[] args) {
		int w = 12;
		int h = 8;
		long answer = 0;
		
		if(w<h) {
			answer = (w*h) - (w*2) ;
		}else {
			answer = (w*h) - (h*2) ;
		}
		System.out.println(answer)
		
	}
}
