package Academy;
//import를 통해 사용한다고 이야기 하고 사용 (리액트처럼)
import java.util.Scanner;
public class input {

	public static void main(String[] args) {
		// 예제 프로그램에서 사용하기 위한 scnner 객체 사용 연습
		//scanner 객체 : 키보드를 통한 입력을 가능하게 하는 클래스 객체
		// 스캐너 객체 참조 변수 선언하고 , 생성해서 사용
		
		//키보드를 통해 입력되는 모든 값은 기본적으로 문자값으로 들아옴
		Scanner sc = new Scanner(System.in); // System.in : 기본 입력장치 (기본은 키보드)
		System.out.println("첫번째 숫자 입력 : ");
		int num1 = sc.nextInt(); // 사용자가 입력된 값이 정수로 변환
		
		System.out.println("두번째 숫자 입력 : ");
		int num2 = sc.nextInt(); // 사용자가 입력된 값이 정수로 변환
		
		System.out.println();
		System.out.println("두 수의 합 : " + (num1 + num2));
		
		
		
		System.out.println("세번째 숫자 입력 : ");
		double num3= sc.nextDouble(); // 사용자가 입력된 값이 정수로 변환
		
		System.out.println("네번째 숫자 입력 : ");
		double num4 = sc.nextDouble(); // 사용자가 입력된 값이 정수로 변환
		
		System.out.println();
		System.out.println("두 수의 합 : " + (num3 + num4));
		
		System.out.println("이름 입력 : ");
		String strint = sc.next();
		System.out.println(strint);
		
		System.out.println("숫자를 입력해주세요");
		int a = sc.nextInt();
		System.out.println("두번째 숫자를 입력해주세요");
		int b = sc.nextInt();
		System.out.println("두 수의 합은 " + (a + b) + " 입니다");
		
		
		sc.close(); //
		
	}

}
