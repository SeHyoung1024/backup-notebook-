package Academy;

public class DataType {

	public static void main(String[] args) {
			char a = 'A'; 
			char b = '\u0041'; // 유니코드 문자 A
			char c =  65; // 아스키코드 문자 A
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println();
			
			System.out.println((int)a);
			System.out.println((int)b);
			System.out.println((int)c);
			
			System.out.println((int)'A');
			System.out.println((int)'B');
			System.out.println((int)'Z');
			//65 ~ 90 : 대문자 아스키 코드
			System.out.println((int)'a');
			System.out.println((int)'z');
			//97~122 : 소문자 아스키 코드
			System.out.println((int)'0');
			System.out.println((int)'9');
			//48~57: 숫자 아스키 코드
			
	}

}
