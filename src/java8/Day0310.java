package java8;

import java.util.Scanner;

public class Day0310 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Դϱ�?(���� : 1, �����ƴ� : 0) : ");
		int city = sc.nextInt();
		System.out.print("�α�(���� : ��) : ");
		int people = sc.nextInt();
		System.out.print("������ ��(���� : ��) : ");
		int rich = sc.nextInt();
		
		boolean condition1 = (city==1)&&(people>=100);
		boolean condition2 = (rich >= 50);
		boolean metro = condition1&&condition2;
		
		System.out.println("��Ʈ�������� ���� : " + metro);

	}

}
