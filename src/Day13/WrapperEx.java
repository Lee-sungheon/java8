package Day13;

public class WrapperEx {

	public static void main(String[] args) {
		int number = 10;
		
		//�ڽ�
		Integer iBox = new Integer(number);
		Integer iBox2 = Integer.valueOf(number);
		
		//��ڽ�
		number = iBox.intValue();
		number = iBox2.intValue();
		
		//�ڵ� �ڽ�
		Integer ibox3 = number;
		
		//�ڵ� ��ڽ�
		int res = ibox3 + 10;
		System.out.println(res);

	}

}
