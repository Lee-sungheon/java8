package java8;

public class Day1002 {
	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50};	//����ÿ��� �������� �����ݷ� ���
		int arr2[] = {60, 70, 80, 90, 100};	//2���� �������� ȥ���ص� �������� ����
		
		for(int i=0 ; i<5 ; i++)
			System.out.println(arr1[i]);
		
		for(int i=0 ; i<5 ; i++)
			System.out.println(arr2[i]);
		
		arr1[2] = 300;	//�迭�� �ε����� �Ϲ� ����ó�� ���� ������ �� �ִ�.
		for(int i=0 ; i<5 ; i++)
			System.out.println(arr1[i]);
		
		int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8};
		for(int i=0 ; i<arr3.length ; i++)
			System.out.println(arr3[i]);
		
	}
}
