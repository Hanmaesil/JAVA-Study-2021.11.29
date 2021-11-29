import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		// main 메소드

		//******* 클래스와 같은 위치에 메소드를 생성 할 경우
		// 꼭!!!!! static 키워드 붙여주기!!!!!!!
		
		
		
		
		// Method : 어떠한 계산을 위한 행위, 계산을 위한 방법을 저장 해둔 것.
		// 반복적으로 사용되는 코드 최소화.
		// 어떤 작업을 수행하기 위한 명령문의 집합.
		// 메소드 구조
		// - 접근 제한자(지정자) : public
		// - 리턴 타입 : 메소드 수행 이후 결과 값으로 돌아오는 데이터에 대한 타입.
		// - 메소드의 이름
		// - 메소드가 사용할 X값 : 메소드 매개 변수 ->> 소괄호 안에 들어갈 내용.

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();

		int result = addNumber(num1, num2);
		System.out.println(result);
		
		
		// 메소드는 크게 메소드 호출과 메소드 정의로 작업이 진행된다.

	}//main 메소드가 끝나는 부분
	
	//새롭게 메소드를 만들 수 있는 영역.(main과 class의 사이에서 만든다)
	//public static int(->리턴타입) addNumber(->변수이름) (int x1, int x2)(->매개 변수)
	//접근 지정자 public : 내부/외부(다른 클래스) 어디서든 접근이 가능한 지정다.
	public static int addNumber(int x1, int x2) {
		
		int result = x1 + x2;
		
		return result;								//addNumber의 알고리즘 입력칸., return값은 위에 타입과 같은것만 입력된다.(정수는 정수끼리)
	}
	
	
	
	
	
	
	
}//class 끝나는 부분
