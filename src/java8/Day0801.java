package java8;

public class Day0801 {

	public static void main(String[] args) {
		//1~100 �� 3�� 5�� ������� �� ���
		int sum = 0;
		for(int i=1 ; i<=100 ; i++) {
			
			if(i%3==0 && i%5==0)
				sum=+i;
		}
		System.out.println(sum);
		
		// 1~100 �߿� ¦���� ���ϰ� Ȧ���� �� ����� ���
		int result = 0;
		for(int i=1 ; i<=100; i++)
		{
			if(i%2==0) result+=i;
			else result-=i;
		}
		System.out.println(result);
	}

}
