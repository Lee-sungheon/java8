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
			throw new NullPointerException();  //강제적으로 예외를 발생시키려면 객체를 생성해서 throw
			
		} catch(ArrayIndexOutOfBoundsException | ArrayStoreException e) {
			System.out.println("배열은 범위를 넘어서 사용할 수 없습니다.");
		} catch(ArithmeticException e) {
			System.out.println("숫자 연산이 불가능합니다.");
		} catch(Exception e) {
			System.out.println("발생된 모든 예외를 처리합니다.");
			e.printStackTrace();
		} finally {
			System.out.println("finally 구간입니다.");
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
