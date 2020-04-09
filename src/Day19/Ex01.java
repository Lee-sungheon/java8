package Day19;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Map<String, String> ht = new Hashtable<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("공백으로 분리된 이름과 전화번호를 입력하시오. ");
		ht.put(sc.next(), sc.next());
		ht.put(sc.next(), sc.next());
		ht.put(sc.next(), sc.next());
		ht.put(sc.next(), sc.next());
		
		System.out.println("전화번호를 검색할 이름을 입력하시오.");
		String find = sc.next();
		System.out.println(find + "의 전화번호는 " + ht.get(find) + "입니다.");
		
		sc.close();
	}
}
