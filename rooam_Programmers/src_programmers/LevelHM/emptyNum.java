package LevelHM;

public class emptyNum {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 0, 0, 0, 0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 5, 6, 0, 2};
		// { 1, 2, 3, 0, 0, 0, 1, 0, 0, 0, 0, 3, 4 };
		int cnt = 0;// 0�� ������ ã�� ����
		int answer = 0;// �ִ� ��ĭ ���

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				cnt++; // 0�� ���� ī��Ʈ
			} else {
				if (answer <= cnt) {
					answer = cnt; // �����ص� ������ ĭ���� ũ�ų� ���� ��쿡�� ��º��� �Է�
				}
				cnt = 0;// 0�� �ƴҶ��� �ʱ�ȭ
			}
			if (i == a.length-1 && answer <= cnt) {
				answer = cnt;
			}//������ ������ ��쿡 �Է��ϰ� for�� ����
		}
		System.out.println(answer);
	}
//	public static void main(String[] args) {
//		System.out.println(empty(0, 0, 0));//ó���� �迭�� �ε��� ������, �� ��°�� ���� ī��Ʈ, �� ��°�� ���� �ִ� ����� ��
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
