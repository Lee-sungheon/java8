package Day01_11;

public class Day1103 {

	public static void main(String[] args) {
		// 1~45�� �Է��� �迭�� �ۼ�
		// �ۼ��� �迭�� �������� ����
		// �ε��� 0~6���� ���
		
		int[] arr = new int[45];
		for(int i = 0 ; i<45 ; i++)
			arr[i] = i + 1;

		for(int i=0 ; i<100 ; i++) {
			
			int n = 0, m = 0, temp = 0;
			n = (int)(Math.random()*arr.length);
			m = (int)(Math.random()*arr.length);
			
			temp = arr[n];
			arr[n] = arr[m];
			arr[m] = temp;
			
		}
		
		for(int i = 0 ; i<45 ; i++)
			System.out.print(arr[i] + " ");

		
		//���ڿ� ��ȯ
		String temp = "ab";
		char a = 'a', b = 'b';
		temp = Character.toString(a) + Character.toString(b);
		System.out.println(temp);
		
		
	}

}
