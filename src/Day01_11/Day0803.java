package Day01_11;

import java.util.Random;
import java.util.Scanner;

public class Day0803 {

	public static void main(String[] args) {
		//������ �����ؼ� ������ ������ ����ϰ� ���� �Է��ϵ��� �ۼ�
	
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int random1, random2, quiz, ans;
		
		long startTime = System.currentTimeMillis();
		for (int i=0 ; i<10 ; i++)
		{
			random1 = rd.nextInt(8) + 2;
			random2 = rd.nextInt(9) + 1;
			quiz = random1 * random2;

			System.out.print(random1 + " X " + random2 + " = ");
			ans = sc.nextInt();

			if (quiz == ans)
				System.out.println("�����Դϴ�.");
			else
			{
				System.out.println("�����Դϴ�. ������ �����մϴ�.");
				System.exit(0);
			}
			
		}
		long endTime = System.currentTimeMillis();
		System.out.println("���� ���� �ð� : " + ((double)endTime - startTime)/1000 + "s");
		
	}

}
