import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		// main �޼ҵ�

		//******* Ŭ������ ���� ��ġ�� �޼ҵ带 ���� �� ���
		// ��!!!!! static Ű���� �ٿ��ֱ�!!!!!!!
		
		
		
		
		// Method : ��� ����� ���� ����, ����� ���� ����� ���� �ص� ��.
		// �ݺ������� ���Ǵ� �ڵ� �ּ�ȭ.
		// � �۾��� �����ϱ� ���� ��ɹ��� ����.
		// �޼ҵ� ����
		// - ���� ������(������) : public
		// - ���� Ÿ�� : �޼ҵ� ���� ���� ��� ������ ���ƿ��� �����Ϳ� ���� Ÿ��.
		// - �޼ҵ��� �̸�
		// - �޼ҵ尡 ����� X�� : �޼ҵ� �Ű� ���� ->> �Ұ�ȣ �ȿ� �� ����.

		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int num2 = sc.nextInt();

		int result = addNumber(num1, num2);
		System.out.println(result);
		
		
		// �޼ҵ�� ũ�� �޼ҵ� ȣ��� �޼ҵ� ���Ƿ� �۾��� ����ȴ�.

	}//main �޼ҵ尡 ������ �κ�
	
	//���Ӱ� �޼ҵ带 ���� �� �ִ� ����.(main�� class�� ���̿��� �����)
	//public static int(->����Ÿ��) addNumber(->�����̸�) (int x1, int x2)(->�Ű� ����)
	//���� ������ public : ����/�ܺ�(�ٸ� Ŭ����) ��𼭵� ������ ������ ������.
	public static int addNumber(int x1, int x2) {
		
		int result = x1 + x2;
		
		return result;								//addNumber�� �˰��� �Է�ĭ., return���� ���� Ÿ�԰� �����͸� �Էµȴ�.(������ ��������)
	}
	
	
	
	
	
	
	
}//class ������ �κ�
