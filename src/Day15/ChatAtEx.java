package Day15;

public class ChatAtEx {

	public static void main(String[] args) {
		//charAt
		String str = "Hello, World!!!";
		char ch = str.charAt(4);
		System.out.println(ch);
		char[] ch2 = new char[str.length()];
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
			ch2[i] = str.charAt(i);
		}
		System.out.println();
		
		//IndexOf
		
		String str2 = "자바 프로그래밍";
		int index = str2.indexOf("프로");
		System.out.println(index);
		index = str2.indexOf("C언어");
		System.out.println(index);
		str2 = "자바자바자바 프로프로 그래밍이이입니다.";
		index = str2.indexOf("바");					//매개변수가 한개일 경우 0번 Index부터 시작
		System.out.println(index);
		index = str2.indexOf("바", index+1);		//첫번째 매개변수 : 검색어, 두번째 매개변수 : 검색 시작 위치
		System.out.println(index);
		index = str2.indexOf("바", index+1);
		System.out.println(index);
		index = str2.indexOf("바", index+1);
		System.out.println(index);
		
		String str3 = str2.replace("프로프로", "프로");
		System.out.println(str3);
		String str4 = str2.replace("자바", "Java");
		System.out.println(str4);
		
		String str5 = "990915-1234567";
		String firstNum = str5.substring(0,6);
		String secondNum = str5.substring(7);
		System.out.println(firstNum);
		System.out.println(secondNum);
		
	}

}
