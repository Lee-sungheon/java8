package Day01_11;

import java.util.Random;
import java.util.Scanner;

public class Day0716 {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int score = 0;
		int life = 3;

		while (true) {

			System.out.println("����, ����, �� �� �ϳ��� �����ϼ���. (���� : s, ���� : r, �� : p, ���� : q)");
			System.out.print(">> ");
			String user = sc.nextLine();

			int intuser;
			int com = rd.nextInt(3);

			String userRsp, comRsp;

			if (user.equalsIgnoreCase("s"))
			{
				userRsp = "����";
				intuser = 0;
			}
			else if (user.equalsIgnoreCase("r"))
			{
				userRsp = "����";
				intuser = 1;
			}
			else if (user.equalsIgnoreCase("p")) 
			{
				userRsp = "��";
				intuser = 2;
			}
			else if (user.equalsIgnoreCase("q"))
			{
				System.out.println("������ �����մϴ�.");
				break;
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				continue;
			}

			if (com == 0)
				comRsp = "����";
			else if (com == 1)
				comRsp = "����";
			else
				comRsp = "��";

			if (intuser - com == 1 || intuser - com == -2)
			{
				System.out.println("���� ��! (��ǻ�� : " + comRsp + ", ���� : " + userRsp + ")");
				score += 100;
			}
			else if (com - intuser == 1 || com - intuser == -2)
			{
				System.out.println("��ǻ�� ��! (��ǻ�� :" + comRsp + ", ���� : " + userRsp + ")");
				life -= 1;
			}
			else
			{
				System.out.println("���º�! (��ǻ�� : " + comRsp + ", ���� : " + userRsp + ")");
				score += 10;
			}

			System.out.println("���� ���� : " + score + ", ���� Life : " + life );
			System.out.println();
			if (life == 0)
			{
				System.out.println("Game Over!! ������ �����մϴ�.\n���� : " + score);
				break;
			}
		}
	}
}
