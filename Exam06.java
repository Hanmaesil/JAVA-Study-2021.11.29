
public class Exam06 {

	public static void main(String[] args) {

		// �ǽ� : ��Ģ������ ������ �޼ҵ带 �ۼ��� ���ÿ�.

		sum(3, 5);
		minus(3, 5);
		a(3, 5);
		b(3, 5);

	}

	public static void sum(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);

	}

	public static void minus(int num1, int num2) {
		int minus = num1 - num2;
		System.out.println(minus);
	}

	public static void a(int num1, int num2) {
		int a = num1 * num2;
		System.out.println(a);
	}

	public static void b(int num1, int num2) {
		int b = num1 / num2;
		System.out.println(b);
	}

}
