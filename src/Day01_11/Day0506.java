package Day01_11;

import java.util.Scanner;

public class Day0506 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("당신의 등급을 입력해 주세요 : ");
//		String grade = sc.next();
//		
//		switch(grade) {
//			case "s":
//			case "S":
//				System.out.println("당신은 vip입니다.");
//				break;
//			case "a":
//			case "A":
//				System.out.println("당신은 우대 고객입니다.");
//				break;
//			case "b":
//			case "B":
//				System.out.println("당신은 우수 고객입니다.");
//				break;
//			case "c":
//			case "C":
//				System.out.println("당신은 일반 고객입니다.");
//				break;
//			default:
//				System.out.println("S~C까지 입력해주세요.");
//		}
		
		System.out.println("메뉴를 선택해주세요. (a:아메리카노, c:카푸치노, i:카페라떼, m:카페모카)");
		String menu = sc.next();
		
		
		switch(menu) {
			case "a":
			case "A":
				System.out.println("아메리카노 선택");
				break;
			case "c":
			case "C":
				System.out.println("카푸치노 선택");
				break;
			case "i":
			case "I":
				System.out.println("카페라떼 선택");
				break;
			case "m":
			case "M":
				System.out.println("카페모카 선택");
				break;
			default:
				System.out.println("메뉴를 정확하게 입력해주세요.");
		}
		
		sc.close();

	}

}
