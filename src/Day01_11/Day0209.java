package Day01_11;

import java.util.*;

public class Day0209 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		String name;
		int percent;
		percent = rd.nextInt(51) + 50;
		
		System.out.print("사용자의 이름을 입력해주세요 : ");
		name = sc.nextLine();
		
		System.out.print(name + "님의 오늘의 운세는 ");
		System.out.println(percent + "%입니다.");
		
		sc.close();
	}
}