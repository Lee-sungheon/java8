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

			System.out.println("가위, 바위, 보 중 하나를 선택하세요. (가위 : 0, 바위 : 1, 보 : 2, 9 : 종료)");
			int user = sc.nextInt();

			int com = rd.nextInt(3);

			String userRsp, comRsp;

			if (user == 0)
				userRsp = "가위";
			else if (user == 1)
				userRsp = "바위";
			else if (user == 2)
				userRsp = "보";
			else if (user == 9)
			{
				System.out.println("게임을 종료합니다.");
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}

			if (com == 0)
				comRsp = "가위";
			else if (com == 1)
				comRsp = "바위";
			else
				comRsp = "보";

			if (user - com == 1 || user - com == -2)
			{
				System.out.println("유저 승! (컴퓨터 : " + comRsp + ", 유저 : " + userRsp + ")");
				score += 10;
			}
			else if (com - user == 1 || com - user == -2)
			{
				System.out.println("컴퓨터 승! (컴퓨터 :" + comRsp + ", 유저 : " + userRsp + ")");
				life -= 1;
			}
			else
			{
				System.out.println("무승부! (컴퓨터 : " + comRsp + ", 유저 : " + userRsp + ")");
				score += 1;
			}

			System.out.println("현재 점수 : " + score + ", 남은 Life : " + life );
			System.out.println();
			if (life == 0)
			{
				System.out.println("Game Over!! 게임을 종료합니다.");
				break;
			}
		}
	}
}
