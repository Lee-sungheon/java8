package Day01_11;

import java.util.Scanner;

public class Day0501 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ȧ���� ¦���� �Ǻ��ϴ� ���α׷��Դϴ�. \n���ڸ� �Է����ּ���.");
		int inputNumber = sc.nextInt();
		
//		String result = inputNumber % 2 == 0 ? "¦��" : "Ȧ��"; //���� �����ڸ� ���
		
		if (inputNumber%2==0)
			System.out.printf("�Է��� ���ڴ� %d�̸� ¦���Դϴ�.",inputNumber);
		else
			System.out.printf("�Է��� ���ڴ� %d�̸� Ȧ���Դϴ�.",inputNumber);
		
	}

}
