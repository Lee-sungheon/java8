package Day01_11;

public class Day0705 {

	public static void main(String[] args) {
		
		int sum = 0, max = 50;
		
		for(int i = 1 ; i <= max ; i++)
		{
			if(i%3 == 0)
				sum += i;
		}
		
		System.out.println("1부터 " + max + "까지 3의 배수의 합 : " + sum);

	}

}
