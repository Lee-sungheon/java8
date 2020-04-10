package Day01_11;

public class Day0709 {

	public static void main(String[] args) {
		
		int sum = 0, max = 50, cnt = 0;
		
		for(int i = 1 ; i <= max ; i++)
		{
			sum += i;
		}
		
		System.out.println("1부터 " + max + "까지 합의 평균 : " + (double)sum/max);

	}

}
