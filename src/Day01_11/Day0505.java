package Day01_11;

import java.util.Random;

public class Day0505 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int now = rd.nextInt(4) + 9;
		System.out.println("���� �ð��� " + (now-1) + "�� 50���Դϴ�.");
		System.out.println("���� �ϰ�");
		
		switch(now) {
			case 9:
				System.out.println("9�ÿ��� ����� �մϴ�.");
			case 10:
				System.out.println("10�ÿ��� ȸ���� �մϴ�.");
			case 11:
				System.out.println("11�ÿ��� ������ ó���մϴ�.");
			case 12:
				System.out.println("12�ÿ��� ������ �Խ��ϴ�.");
		}

	}

}
