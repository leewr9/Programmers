package Level2;

import java.util.ArrayList;

public class MaxModify {

	public static void main(String[] args) {
		ArrayList<String> exArray = new ArrayList<>();
		String expression = "100-200*300-500+20";
		String[] mdf = { "*", "+", "-" };
		int index = 0;
		int point = 0
		
		int in = 0;
		int max = 0;// 최댓값
		int sum = 0;// 우선순위 별 더한값
		int brk = 0;// 3개 연산자 최대 9번

		while (brk < 9) {
			if (brk % 3 == 0) {
				for (int i = 0; i < expression.length(); i++) {
					if (expression.charAt(i) < 48 || expression.charAt(i) > 57) {
						exArray.add(expression.substring(point, i));
						exArray.add(String.valueOf(expression.charAt(i)));
						point = i + 1;
					}
					if (expression.length() - 1 == i) {
						exArray.add(expression.substring(point, i + 1));
						point = 0;
					}
				} // 수식 나누기
				if(sum < 0) {
					Math.abs(sum);
				}
				
				if(max < sum) {
					max = sum;
				}
				sum = 0;
			}
			
			for (int i = 0; i < exArray.size(); i++) {
				if (mdf[index].equals(exArray.get(i))) {
					if (exArray.get(i).equals("*")) {
						in = Integer.valueOf(exArray.get(i - 1)) * Integer.valueOf(exArray.get(i + 1));
						sum += in;
						exArray.add(i, String.valueOf(in));
						exArray.remove(i - 1);
						exArray.remove(i + 1);
					} else if (exArray.get(i).equals("+")) {
						in = Integer.valueOf(exArray.get(i - 1)) + Integer.valueOf(exArray.get(i + 1));
						sum += in;
						exArray.add(i, String.valueOf(in));
						exArray.remove(i - 1);
						exArray.remove(i + 1);
					} else if (exArray.get(i).equals("-")) {
						in = Integer.valueOf(exArray.get(i - 1)) - Integer.valueOf(exArray.get(i + 1));
						sum += in;
						exArray.add(i, String.valueOf(in));
						exArray.remove(i - 1);
						exArray.remove(i + 1);
					}
				}
			}
			System.out.println(index);
			brk++;
			index++;
			if (index == mdf.length) {
				index = 0;
			}
		}

		System.out.println(max);

	}
}
