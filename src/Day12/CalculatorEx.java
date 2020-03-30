package Day12;

public class CalculatorEx {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.powerOff();
		System.out.println(cal.plus(10, 20));
		System.out.println(cal.divide(10, 5));
		cal.powerOn();
		System.out.println(cal.plus(10, 20));
		System.out.println(cal.divide(10, 5));
		
		byte num1 = 10, num2 = 3;
		double res2 = cal.divide(num1, num2);		//���� �ڷ����� �ڵ� ����ȯ ��
		System.out.println(res2);
		
		long num3 = 100, num4 = 30;
		double res3 = cal.divide((int)num3, (int)num4);		//ū �ڷ����� ���� ����ȯ �������
		System.out.println(res3);
		
		double res4 = cal.plus(num3, num4);		//ū �ڷ����� ���� ����ȯ �������
		System.out.println(res4);

	}

}
