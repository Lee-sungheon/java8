package Day01_11;

import java.util.*;

public class Day0209 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		String name;
		int percent;
		percent = rd.nextInt(51) + 50;
		
		System.out.print("������� �̸��� �Է����ּ��� : ");
		name = sc.nextLine();
		
		System.out.print(name + "���� ������ ��� ");
		System.out.println(percent + "%�Դϴ�.");
		
		sc.close();
	}
}