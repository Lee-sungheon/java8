package Day01_11;

/* 단축키 
ctrl + space : 자동 완성
ctrl + d : 한 행 삭제
alt + 방향키 : 한줄 이동
ctrl + end, home : 맨 끝 또는 맨 처음 이동
ctrl + 방향키 : 마우스 휠 효과
ctrl + L : 원하는 줄로 이동
ctrl + shift + c : 그 줄 주석 처리
alt + shift + a : 전체 화면 
alt + 방향키 : 전체 화면후 한번에 선택

*/


public class Day0211 {

	public static void main(String[] args) {
		char ch;
		String str;
		ch = 'A' + '1';
		System.out.println(ch);
		int res = ch;
		System.out.println(res);
		str = "A" + "1"; //문자열은 아무것도 없거나 한 개의 문자만 있어도
						 //쌍따옴표로 감싸면 문자열임
		System.out.println(str);  //문자열의 덧셈은 하나의 문자열로 합치게 됨
		String str2 = "10";
		int num2 = 10;

		
		int num3 = 10;
		String res2 = str2 + num2;  //문자열과 다른 자료형이 합치게 되면 하나의 문자열이 됨
		
		int num4 = 20;
		System.out.println(num3 + "" + num4);  //숫자를 문자로 변형하는 방법1
		String str3 = String.valueOf(num3);   //숫자를 문자로 변형하는 방법2
		
		String str4 = "100";
		System.out.println(str4 + 100);
		
		int num5 = Integer.valueOf(str4); //문자를 숫자로 변형하는 방법
		System.out.println(num5);
		double d1 = Double.valueOf(str4);
		
		
		int num6 = Integer.parseInt(str4);
		double d2 = Double.parseDouble(str4);
		
		String str5 = "Hello";
		// int num7 = Integer.valueOf(str5);  숫자가 아니면 value 처리 안됨
		// int num7 = Integer.parseInt(str5); 상동
	}
}
