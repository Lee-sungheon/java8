package Day01_11;

import java.util.Scanner;

public class Day0506 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("����� ����� �Է��� �ּ��� : ");
//		String grade = sc.next();
//		
//		switch(grade) {
//			case "s":
//			case "S":
//				System.out.println("����� vip�Դϴ�.");
//				break;
//			case "a":
//			case "A":
//				System.out.println("����� ��� ���Դϴ�.");
//				break;
//			case "b":
//			case "B":
//				System.out.println("����� ��� ���Դϴ�.");
//				break;
//			case "c":
//			case "C":
//				System.out.println("����� �Ϲ� ���Դϴ�.");
//				break;
//			default:
//				System.out.println("S~C���� �Է����ּ���.");
//		}
		
		System.out.println("�޴��� �������ּ���. (a:�Ƹ޸�ī��, c:īǪġ��, i:ī���, m:ī���ī)");
		String menu = sc.next();
		
		
		switch(menu) {
			case "a":
			case "A":
				System.out.println("�Ƹ޸�ī�� ����");
				break;
			case "c":
			case "C":
				System.out.println("īǪġ�� ����");
				break;
			case "i":
			case "I":
				System.out.println("ī��� ����");
				break;
			case "m":
			case "M":
				System.out.println("ī���ī ����");
				break;
			default:
				System.out.println("�޴��� ��Ȯ�ϰ� �Է����ּ���.");
		}
		
		sc.close();

	}

}
