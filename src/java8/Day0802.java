package java8;

import java.util.Scanner;

public class Day0802 {

	public static void main(String[] args) {
		//"Hello, world 10�� ���
		for(int i=0 ; i<10 ; i++)
		{
			System.out.println("Hello, world!" + i);
		}

		//@ 5���� 7�� ���
		for(int i=0 ; i<7 ; i++)
		{
			for(int j=0 ; j<5 ; j++)
				System.out.print("@");
			System.out.println();	
		}
		
		System.out.println();
		
		//�� ��¹����� 2���� 4���� #�� �ǵ��� ����
		for(int i=0 ; i<7 ; i++)
		{
			for(int j=0 ; j<5 ; j++)
			{
				if(i%2 == 1)
					System.out.print("#");
				else
					System.out.print("@");
			}
			System.out.println();	
		}
		
		//���ڿ��� �Է¹޾Ƽ� for������ ����ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��� �ּ���.");
		String str = sc.nextLine();
		for(int i=0 ; i<str.length() ; i++)
			System.out.print(str.charAt(i));
		
	}

}
