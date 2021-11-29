
public class Exam02 {

	public static void main(String[] args) {

		int[][] ary = new int[5][5];

		// 배열 만들고 순서만 바꾸기.
		int cnt = 21;
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				ary[i][j] = cnt++; // 값이 한번 나오고 증가.
//				cnt++;
			}
		}

		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary.length; j++) {
				System.out.printf("%3d", ary[j][i]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		for (int i = 4; i >= 0; i--) {
			for (int j = 4; j >= 0; j--) {
				System.out.printf("%3d", ary[j][i]);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		for (int i = 4; i >= 0; i--) {
			for (int j = 4; j >= 0; j--) {
				System.out.printf("%3d", ary[i][j]);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		// 배열에 바로 값을 집어 넣기.

		int[][] ary1 = new int[5][5];

		for (int i = 0; i < ary1.length; i++) {
			for (int j = 0; j < ary1.length; j++) {
				System.out.printf("%3d", ary[i][j] = 21 + i + (5 * j));

			}
			System.out.println();
		}

	}

}
