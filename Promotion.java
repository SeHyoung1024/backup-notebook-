package Academy;

public class Promotion {

	public static void main(String[] args) {
			byte bval = 10;
			int ival = bval;
			System.out.println(bval);
			
			char cval = 'A';
			ival = cval;
			System.out.println(ival); // 한글이면 유니코드 / 영어 , 숫자면 아스키코드
			
			double dval = 100.1;
			ival = (int)dval;
			System.out.println(ival);
			
	}

}
