package Level1;

public class NotNum {

	public static void main(String[] args) {
		int[] arr = { 1,1,3,3,0,1,1 };
		int[] answer;
		int size=1;
		int save=arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(save!=arr[i]) {
				size++;
			}
			save=arr[i];
		}
		
		answer=new int[size];
		answer[0]=arr[0];
		size=0;
		
		for(int i=0; i<arr.length; i++) {
			if(answer[size]==arr[i]) {
				answer[size]=arr[i];
			}else {
				size++;
				answer[size]=arr[i];
			}
		}
		
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}
