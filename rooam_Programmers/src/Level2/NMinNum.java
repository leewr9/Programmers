package Level2;

public class NMinNum {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 }; // 168
		int max = 0;
		int sum = 0;
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				sum = i;
			}
		}
		arr[sum] = 0;
		sum = max;

		while (true) {
			cnt = arr.length-1;
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]!=0) {
					if (sum % arr[i] == 0) {
						cnt--;
					} else {
						break;
					}
				}
			}
			
			if(cnt == 0) {
				break;
			}

			sum = sum + max;
		}

		int answer = sum;
		System.out.println(answer);
	}

}
