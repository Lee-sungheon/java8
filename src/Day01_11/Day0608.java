package Day01_11;

import java.util.Scanner;

public class Day0608 {

	public static void main(String[] args) {
		int intyear;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Ǻ��� �⵵ �Է�!");
		intyear = sc.nextInt();
		
		if ((intyear%4==0 && intyear%100==0 && intyear%400==0) || (intyear%4==0 && intyear%100!=0))
		{
			System.out.println(intyear+"�� �����̴�.");
		}
		else
		{
			System.out.println(intyear+"�� ������ �ƴϴ�.");
		}

	}

}
