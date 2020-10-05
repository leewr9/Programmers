package Level1;

public class CenterWord {

	public static void main(String[] args) {
		String s="abcdefgadgad";
		int snum=s.length()/2;
		
		if(s.length()%2==0) {
			s=s.substring(snum-1, snum+1);
		}else {
			s=s.substring(snum, snum+1);
		}
		System.out.println(s);
		
	}
}
