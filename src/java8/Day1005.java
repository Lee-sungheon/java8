package java8;

public class Day1005 {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50};
		int[][] ary1 = {{10, 20}, {30, 40}, {50, 60}, {70, 80}}; //new int[4][2];
		
		for(int i=0 ; i<ary1.length ; i++)
			for(int j=0 ; j<ary1[i].length ; j++)
				System.out.println(ary1[i][j]);
		
		System.out.println(ary1.length);
		System.out.println(ary1[0].length);
		System.out.println(ary1[1].length);
		System.out.println();
		
		int[][] ary2 = new int[][] {{10,20},{30,40},{50,60}};
		
		//길이가 다른 2차원 배열
		int[][] ary3 = new int[3][];
		ary3[0] = new int[5];
		ary3[1] = new int[3];
		ary3[2] = new int[10];
		
		System.out.println(ary3.length);
		System.out.println(ary3[0].length);
		System.out.println(ary3[1].length);
		System.out.println(ary3[2].length);
	}

}
