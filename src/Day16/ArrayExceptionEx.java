package Day16;

public class ArrayExceptionEx{

	public static void main(String[] args){

		exceptionTest();
	}
	
	static void exceptionTest() {
		int[] arr = new int[3];
		try {
			arr[2] = 100;
			System.out.println(arr[2]);	
			throw new NullPointerException();  //���������� ���ܸ� �߻���Ű���� ��ü�� �����ؼ� throw
			
		} catch(ArrayIndexOutOfBoundsException | ArrayStoreException e) {
			System.out.println("�迭�� ������ �Ѿ ����� �� �����ϴ�.");
		} catch(ArithmeticException e) {
			System.out.println("���� ������ �Ұ����մϴ�.");
		} catch(Exception e) {
			System.out.println("�߻��� ��� ���ܸ� ó���մϴ�.");
			e.printStackTrace();
		} finally {
			System.out.println("finally �����Դϴ�.");
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
