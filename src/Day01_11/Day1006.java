package Day01_11;

public class Day1006 {

	public static void main(String[] args) {
		int arr1[] = new int[3];
		for(int i=0 ; i<arr1.length ; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0 ; i<arr1.length ; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		
		double[] arr2 = new double[3];
		arr2[0] = 1.1;
		arr2[1] = 2.2;
		arr2[2] = 3.3;
		
		for(int i=0 ; i<arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println();
	}

}
