package java8;

public class Day1004 {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50};
		
		int[] arr2 = new int[] {10, 20, 30, 40, 50};
		
		String str1 = "�ȳ��ϼ���";
		str1 = "hello"; //������ ������ �ٸ� ��ü�� ������ �� ����
		
		arr2 = new int[] {100, 200, 300, 400, 500}; //�迭�� ������ ������ �ٸ� ��ü�� ������ �� ����
//		arr2 = {100, 200, 300, 400, 500};  // �̰� �ȵ�
		
		arr1 = new int[10]; //�ٸ� ��ü�� ��ȯ ���� -> �ٸ� ũ���� �迭�� ����ϴ°���
							//���� �迭�� ������ ���ο� �迭�� ����� �Ͱ� ����
		
		System.out.println(str1.length());
		System.out.println(arr1.length);
	}

}
