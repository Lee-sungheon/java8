package Day01_11;

public class Day1101 {

	public static void main(String[] args) {
		
		//1���� 100���� �����ϴ� �迭�� ����� ��ü�� �� ���
		
		int[] arr = new int[100];
		int sum = 0;
		
		for(int i=0 ; i<100 ; i++) {
			arr[i] = i+1;
			sum += arr[i];
		}
		
		System.out.println(sum);
		
		//0~9���� ������ �迭�� ��� �� 0���� �ʱ�ȭ�Ͽ� ���
		
		int[] arr2 = new int[10];
		
		for(int i=0 ; i<10 ; i++)
		{
			arr[i] = i;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int i=0 ; i<10 ; i++)
		{
			arr[i] = 0;
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		//�ΰ��� �迭 ��Ҹ� �ʱ�ȭ�ϰ� �������� ��Ģ�� ���� ä��� ���
		int[] arr3 = new int[10];
		arr3[0] = 1;
		arr3[1] = 2;
		
		for(int i=2 ; i<10 ; i++) {
			arr3[i] = arr3[i-2] + arr3[i-1];
		}
		
		for(int i=0 ; i<10 ; i++) {
			System.out.print(arr3[i] + " ");
		}

		System.out.println();
		
	}

}
