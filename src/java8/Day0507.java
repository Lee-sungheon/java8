package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0507 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위, 바위, 보 중 하나를 선택하세요. (가위 : 0, 바위 : 1, 보 : 2)");
		int user = sc.nextInt();
		
		int com = rd.nextInt(3);
		
		String userRsp, comRsp;
		
		if (user == 0) userRsp = "가위";
		else if (user == 1) userRsp = "바위";
		else if (user == 2) userRsp = "보";
		else
		{
			System.out.println("잘못 입력하셨습니다. 프로그램이 종료됩니다.");
			return;
		}
		
		if (com == 0) comRsp = "가위";
		else if (com == 1) comRsp = "바위";
		else comRsp = "보";
		
		if (user-com == 1 || user-com == -2)
			System.out.println("유저 승! (컴퓨터 : " + comRsp + ", 유저 : " + userRsp + ")");
		else if (com-user == 1 || com-user == -2)
			System.out.println("컴퓨터 승! (컴퓨터 :" + comRsp + ", 유저 : " + userRsp + ")");
		else
			System.out.println("무승부! (컴퓨터 : " + comRsp + ", 유저 : " + userRsp + ")");

	}
}
