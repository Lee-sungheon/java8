package Day01_11;

public class Day0708 {

	public static void main(String[] args) {
		for (int i = 1 ; i <= 10 ; i++)
			System.out.print((i+" "));
		System.out.println();
		for (int i = 10 ; i >0 ; i--)
			System.out.print((i+" "));
		
		System.out.println();
		
		for (int i = 10 ; i >0 ; i--)
		{
			for (int j = 0 ; j<i ; j++)
				System.out.print("#");
			System.out.println();
		}
		

	}

}
