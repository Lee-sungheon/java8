package Day19;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Map<String, String> ht = new Hashtable<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �и��� �̸��� ��ȭ��ȣ�� �Է��Ͻÿ�. ");
		ht.put(sc.next(), sc.next());
		ht.put(sc.next(), sc.next());
		ht.put(sc.next(), sc.next());
		ht.put(sc.next(), sc.next());
		
		System.out.println("��ȭ��ȣ�� �˻��� �̸��� �Է��Ͻÿ�.");
		String find = sc.next();
		System.out.println(find + "�� ��ȭ��ȣ�� " + ht.get(find) + "�Դϴ�.");
		
		sc.close();
	}
}
