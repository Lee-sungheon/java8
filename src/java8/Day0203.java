package java8;

public class Day0203 {

	public static void main(String[] args) {
		int num1 = 1000000000;
		int num2 = 2000000000;
		int result = num1 + num2;
		System.out.println(result);
		
		long result2 = (long)num1 + 2000000000l;
		System.out.println(result2);
		
		//자바의 기본 연산은 int -> byte-byte의 결과는 int (short-short도 같음)
		
		long result3 = (short)100 + (short)200; // 오른쪽의 자료형이 왼쪽의 자료형보다 작을 경우 오른쪽에서
												// 왼쪽으로 대입이 가능함. -> 자동형변환, 묵시적형변환, promotion
		int num9 = 10, num10 = 20;
		short result9 = (short)(num9 + num10); //강제형변환, 명시적형변환, casting
		
		int num11 = 10000;
		int num12 = 30000;
		short result10 = (short)(num11 + num12); //표현할수 있는 비트만 표현하기 때문 -> overflow 현상 아님
		System.out.println(result10);
		}

}
