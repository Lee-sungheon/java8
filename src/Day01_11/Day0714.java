package Day01_11;

public class Day0714 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1 ; i <= 100 ; i++)
		{
			if(i%5==0)
				sum+=i;
		}

		System.out.println(sum);
		
		for (int i = 1 ; i <= 50 ; i++)
			if(i%3 == 0)
				System.out.println(i);
		
		// 1~50 �� 3�� ����� ���հ� ���� ���
		int cnt = 0, sum2 = 0;
		for (int i = 1 ; i <= 50 ; i++)
		{
			if(i%3==0)
			{
				sum2+=i;
				cnt++;
			}
		}
		System.out.println("3�� ��� ���� : " + sum2 + ", ���� : " + cnt);
	}

}
