package Day01_11;

public class Day0902 {

	public static void main(String[] args) {
		
		int cnt=0;
		for(int i=0 ; i<5 ; i++)
		{
			if (i % 2 == 1) {
				for (int j = 0; j < 5; j++)
					System.out.print(cnt + 5 - j + "\t");
				cnt += 5;
			}
			
			else {
				for (int j = 0; j < 5; j++)
				{
					cnt++;
					System.out.print(cnt + "\t");
				}
			}

			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0 ; i<5 ; i++)
		{
			for(int j=1 ; j<=i; j++)
				System.out.print(" ");
			System.out.print("@");
			System.out.println();
		}


	}

}
