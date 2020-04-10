package Day01_11;

import java.util.Random;
import java.util.Scanner;

public class Day0607 {

	public static void main(String[] args) {

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int score = 0;
		int life = 3;

		while (true) {

			System.out.println("����, ����, �� �� �ϳ��� �����ϼ���. (���� : 0, ���� : 1, �� : 2, 9 : ����)");
			int user = sc.nextInt();

			int com = rd.nextInt(3);

			String userRsp, comRsp;

			if (user == 0)
				userRsp = "����";
			else if (user == 1)
				userRsp = "����";
			else if (user == 2)
				userRsp = "��";
			else if (user == 9)
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

			if (user - com == 1 || user - com == -2)
			{
				System.out.println("���� ��! (��ǻ�� : " + comRsp + ", ���� : " + userRsp + ")");
				score += 10;
			}
			else if (com - user == 1 || com - user == -2)
			{
				System.out.println("��ǻ�� ��! (��ǻ�� :" + comRsp + ", ���� : " + userRsp + ")");
				life -= 1;
			}
			else
			{
				System.out.println("���º�! (��ǻ�� : " + comRsp + ", ���� : " + userRsp + ")");
				score += 1;
			}

			System.out.println("���� ���� : " + score + ", ���� Life : " + life );
			System.out.println();
			if (life == 0)
			{
				System.out.println("Game Over!! ������ �����մϴ�.");
				break;
			}
		}
	}
}
