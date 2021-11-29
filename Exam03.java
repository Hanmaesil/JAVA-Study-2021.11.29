import java.util.Iterator;

public class Exam03 {

	public static void main(String[] args) {
		
		//실습.
		//배열에 숫자 넣어놓고 출력하기.
		int[][] ary = new int[5][5];
		int cnt = 21;
		for(int i = 0; i < ary.length; i++) {
			for(int j = 0; j < ary.length; j++) {
				ary[i][j] = cnt++;
			}
		}
		
		for(int i = 0; i < ary.length; i++) {
			for(int j = 4; j >= 0; j--) {
				System.out.printf("%3d", ary[i][j]);
			}System.out.println();
		}
		System.out.println();
		System.out.println();
		//배열에 숫자 바로 넣기.
		int[][] ary1 = new int[5][5];
		
		for(int i = 0; i < ary1.length; i++) {
			for(int j = 0; j < ary1.length; j++) {
				ary1[j][i] = (25 - i) + j * 5;
			}
		}
		
		for(int i = 0; i < ary1.length; i++) {
			for(int j = 0; j < ary1.length; j++) {
				System.out.printf("%3d", ary1[i][j]);
			}System.out.println();
		}
		
		
		
	}

}
