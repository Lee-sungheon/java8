package Day01_11;

public class Day1007 {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("2개의 정수를 입력해 주세요.");
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}
		
		String num1 = args[0];
		String num2 = args[1];
		int inum1 = Integer.parseInt(num1);
		int inum2 = Integer.parseInt(num2);
		System.out.println("num1 : " + inum1 + ", num2 : " + inum2);
		System.out.println("num1 + num2 = " + (inum1 + inum2));
	}
}
