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

			System.out.println("가위, 바위, 보 중 하나를 선택하세요. (가위 : s, 바위 : r, 보 : p, 종료 : q)");
			System.out.print(">> ");
			String user = sc.nextLine();

			int intuser;
			int com = rd.nextInt(3);

			String userRsp, comRsp;

			if (user.equalsIgnoreCase("s"))
			{
				userRsp = "가위";
				intuser = 0;
			}
			else if (user.equalsIgnoreCase("r"))
			{
				userRsp = "바위";
				intuser = 1;
			}
			else if (user.equalsIgnoreCase("p")) 
			{
				userRsp = "보";
				intuser = 2;
			}
			else if (user.equalsIgnoreCase("q"))
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

			if (intuser - com == 1 || intuser - com == -2)
			{
				System.out.println("유저 승! (컴퓨터 : " + comRsp + ", 유저 : " + userRsp + ")");
				score += 100;
			}
			else if (com - intuser == 1 || com - intuser == -2)
			{
				System.out.println("컴퓨터 승! (컴퓨터 :" + comRsp + ", 유저 : " + userRsp + ")");
				life -= 1;
			}
			else
			{
				System.out.println("무승부! (컴퓨터 : " + comRsp + ", 유저 : " + userRsp + ")");
				score += 10;
			}

			System.out.println("현재 점수 : " + score + ", 남은 Life : " + life );
			System.out.println();
			if (life == 0)
			{
				System.out.println("Game Over!! 게임을 종료합니다.\n총점 : " + score);
				break;
			}
		}
	}
}
