import java.util.Arrays;

public class Exam01 {

	public static void main(String[] args) {

		// 이차원 배열 생성
		// 자료형 [][] 배열명 = new 자료형[방의크기][방의크기];

		// 5행5열 배열 생성.
		int[][] array = new int[5][5];

		// 1. 배열에 데이터 값 저장하기.
//		array[0][0] = 1;
//		array[0][1] = 2;
//		array[0][2] = 3;

		int cnt = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = cnt;
				cnt++;
			}
		}

		// 2. 배열에 대한 값 확인하기.
		for(int i= 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.printf("%3d",array[i][j]); //"%nd" : 우측으로 n만 큼 정렬.
			}System.out.println();
		}
		
		
		
		
	}

}
