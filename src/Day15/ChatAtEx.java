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
		
		String str2 = "�ڹ� ���α׷���";
		int index = str2.indexOf("����");
		System.out.println(index);
		index = str2.indexOf("C���");
		System.out.println(index);
		str2 = "�ڹ��ڹ��ڹ� �������� �׷��������Դϴ�.";
		index = str2.indexOf("��");					//�Ű������� �Ѱ��� ��� 0�� Index���� ����
		System.out.println(index);
		index = str2.indexOf("��", index+1);		//ù��° �Ű����� : �˻���, �ι�° �Ű����� : �˻� ���� ��ġ
		System.out.println(index);
		index = str2.indexOf("��", index+1);
		System.out.println(index);
		index = str2.indexOf("��", index+1);
		System.out.println(index);
		
		String str3 = str2.replace("��������", "����");
		System.out.println(str3);
		String str4 = str2.replace("�ڹ�", "Java");
		System.out.println(str4);
		
		String str5 = "990915-1234567";
		String firstNum = str5.substring(0,6);
		String secondNum = str5.substring(7);
		System.out.println(firstNum);
		System.out.println(secondNum);
		
	}

}
