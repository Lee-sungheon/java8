package java8;

public class Day0203 {

	public static void main(String[] args) {
		int num1 = 1000000000;
		int num2 = 2000000000;
		int result = num1 + num2;
		System.out.println(result);
		
		long result2 = (long)num1 + 2000000000l;
		System.out.println(result2);
		
		//�ڹ��� �⺻ ������ int -> byte-byte�� ����� int (short-short�� ����)
		
		long result3 = (short)100 + (short)200; // �������� �ڷ����� ������ �ڷ������� ���� ��� �����ʿ���
												// �������� ������ ������. -> �ڵ�����ȯ, ����������ȯ, promotion
		int num9 = 10, num10 = 20;
		short result9 = (short)(num9 + num10); //��������ȯ, ���������ȯ, casting
		
		int num11 = 10000;
		int num12 = 30000;
		short result10 = (short)(num11 + num12); //ǥ���Ҽ� �ִ� ��Ʈ�� ǥ���ϱ� ���� -> overflow ���� �ƴ�
		System.out.println(result10);
		}

}
