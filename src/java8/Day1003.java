package java8;

public class Day1003 {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50};
		int sum = 0;
		for(int i=0 ; i<arr1.length ; i++){
			sum += arr1[i];
		}
		System.out.println(sum);
		
		int[] arr2 = {0, 0, 0, 0, 0};		//0���� ä���� ũ�Ⱑ 5�� �迭
		int[] arr3 = new int[5];			//�迭�� ũ�Ⱑ 5�� ���� ���� �迭, ũ�⸸ ����

		boolean[] arr4 = new boolean[5];
		for(int i=0 ; i<arr4.length ; i++)
			System.out.println(arr4[i]);
		
		String[] arr5 = new String[5];
		for(int i=0 ; i<arr5.length ; i++)
			System.out.println(arr5[i]);
		
//		arr3 = {10, 20, 30, 40, 50};  //�߰�ȣ �ʱ�ȭ�� ������ �ѹ��� ��� ����, 
//										������ �ε����� �����ؾ� ��
		
	}

}
