package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0507 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����, ����, �� �� �ϳ��� �����ϼ���. (���� : 0, ���� : 1, �� : 2)");
		int user = sc.nextInt();
		
		int com = rd.nextInt(3);
		
		String userRsp, comRsp;
		
		if (user == 0) userRsp = "����";
		else if (user == 1) userRsp = "����";
		else if (user == 2) userRsp = "��";
		else
		{
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� ����˴ϴ�.");
			return;
		}
		
		if (com == 0) comRsp = "����";
		else if (com == 1) comRsp = "����";
		else comRsp = "��";
		
		if (user-com == 1 || user-com == -2)
			System.out.println("���� ��! (��ǻ�� : " + comRsp + ", ���� : " + userRsp + ")");
		else if (com-user == 1 || com-user == -2)
			System.out.println("��ǻ�� ��! (��ǻ�� :" + comRsp + ", ���� : " + userRsp + ")");
		else
			System.out.println("���º�! (��ǻ�� : " + comRsp + ", ���� : " + userRsp + ")");

	}
}
