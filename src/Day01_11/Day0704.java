package Day01_11;

public class Day0704 {

	public static void main(String[] args) {
		
		int sum = 0, max = 10;
		
		for(int i = 1 ; i <= max ; i++)
		{
			if(i%2 == 0)
				sum += i;
		}
		
		System.out.println("1부터 " + max + "까지 짝수의 합 : " + sum);

	}

}
