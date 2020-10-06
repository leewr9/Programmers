package LevelHM;

public class emptyNum {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 0, 0, 0, 0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 5, 6, 0, 2};
		// { 1, 2, 3, 0, 0, 0, 1, 0, 0, 0, 0, 3, 4 };
		int cnt = 0;// 0인 공간을 찾을 갯수
		int answer = 0;// 최대 빈칸 출력

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				cnt++; // 0인 공간 카운트
			} else {
				if (answer <= cnt) {
					answer = cnt; // 저장해둔 공백의 칸보다 크거나 같을 경우에만 출력변수 입력
				}
				cnt = 0;// 0이 아닐때는 초기화
			}
			if (i == a.length-1 && answer <= cnt) {
				answer = cnt;
			}//끝까지 공백일 경우에 입력하고 for문 종료
		}
		System.out.println(answer);
	}
//	public static void main(String[] args) {
//		System.out.println(empty(0, 0, 0));//처음은 배열의 인덱스 시작점, 두 번째는 공백 카운트, 세 번째는 가장 최대 공백수 비교
//	}
//
//	public static int empty(int a, int cnt, int answer) {
//		int[] b = { 1, 2, 3, 0, 0, 0, 0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 5, 6, 0, 2};
//		
//		if (a==b.length) {
//			return answer;
//		} else {
//			if(b[a]==0) {
//				cnt++;
//				return empty(a+1, cnt, answer);
//			}else {
//				if(answer<cnt) {
//					answer=cnt;
//					return empty(a+1, 0, answer);
//				}else {
//					return empty(a+1, 0, answer);
//				}
//			}
//		}
//	}
	
	
}
