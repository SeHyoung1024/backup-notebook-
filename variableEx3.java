package Academy;

public class variableEx3 {

	public static void main(String[] args) {
			String head = "야구 모자";
			String top = "기본 맨투맨";
			String bottom = "카고 바지";
			String shoes = "운동화";
			
			int pricehead = 5000;
			int pricetop = 20000;
			int pricebottom = 15000;
			int priceshoes = 30000;
			int totalPrice = pricehead + pricetop + pricebottom + priceshoes;
			
			System.out.println("상품명 / 가격 : " + head + " / " + pricehead);
			System.out.println("상품명 / 가격 : " + top + " / " + pricetop);
			System.out.println("상품명 / 가격 : " + bottom + " / " + pricebottom);
			System.out.println("상품명 / 가격 : " + shoes + " / " + priceshoes);
			System.out.println("-----------------------------------");
			System.out.println("총 주문 금액 : " + totalPrice );
			
	}

}
