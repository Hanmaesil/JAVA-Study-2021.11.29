import java.util.Arrays;

public class Exam01 {

	public static void main(String[] args) {

		// ������ �迭 ����
		// �ڷ��� [][] �迭�� = new �ڷ���[����ũ��][����ũ��];

		// 5��5�� �迭 ����.
		int[][] array = new int[5][5];

		// 1. �迭�� ������ �� �����ϱ�.
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

		// 2. �迭�� ���� �� Ȯ���ϱ�.
		for(int i= 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.printf("%3d",array[i][j]); //"%nd" : �������� n�� ŭ ����.
			}System.out.println();
		}
		
		
		
		
	}

}
