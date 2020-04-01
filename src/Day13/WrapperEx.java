package Day13;

public class WrapperEx {

	public static void main(String[] args) {
		int number = 10;
		
		//¹Ú½Ì
		Integer iBox = new Integer(number);
		Integer iBox2 = Integer.valueOf(number);
		
		//¾ð¹Ú½Ì
		number = iBox.intValue();
		number = iBox2.intValue();
		
		//ÀÚµ¿ ¹Ú½Ì
		Integer ibox3 = number;
		
		//ÀÚµ¿ ¾ð¹Ú½Ì
		int res = ibox3 + 10;
		System.out.println(res);

	}

}
