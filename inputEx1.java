package Academy;
import java.util.Scanner;
public class inputEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 일력");
		String name = sc.next();
		
		System.out.println("학년 입력");
		String classNo = sc.next();
		
		System.out.println("점수 입력");
		double score = sc.nextDouble();
		
		System.out.println("학점 입력");
		String grade = sc.next();
		
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + classNo);
		System.out.println("점수 : " + score);
		System.out.println("학점 : " + grade);
		
		sc.close();

	}

}
