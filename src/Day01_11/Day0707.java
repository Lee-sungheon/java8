package Day01_11;

public class Day0707 {

	public static void main(String[] args) {
		
		int max = 50, cnt = 0;
		
		for(int i = 1 ; i <= max ; i++)
		{
			if(i%3 == 0)
				cnt++;
		}
		
		System.out.println("1���� " + max + "���� 3�� ����� ���� : " + cnt);

	}

}
