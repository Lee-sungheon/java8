package Day19;

import java.util.function.IntBinaryOperator;


public class MethodReferenceEx {

	public static void main(String[] args) {
		IntBinaryOperator operator;
		operator = new IntBinaryOperator() {
			@Override
			public int applyAsInt(int left, int right) {	//�͸�����ü
				return Calulator.staticMethod(left, right);
			}
		};
		int result = operator.applyAsInt(10, 20);
		System.out.println(result);
		
		operator = (int left, int right) -> {	//���ٽ�
			return Calulator.staticMethod(left, right);
		};
		
		operator = (x,y) -> Calulator.staticMethod(x, y);
		result = operator.applyAsInt(10, 20);
		System.out.println(result);
		
		operator = Calulator::staticMethod;	//�޼ҵ� ����
		result = operator.applyAsInt(10, 20);
		System.out.println(result);
		
		Calulator calc = new Calulator();
		operator = calc::instanceMethod;	//�ν��Ͻ� �޼ҵ� ����
											//�ν��Ͻ� �޼ҵ�� Ŭ���������� ȣ�� �Ұ���
		result = operator.applyAsInt(10, 20);
		System.out.println(result);
	}

}
