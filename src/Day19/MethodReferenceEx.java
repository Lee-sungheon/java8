package Day19;

import java.util.function.IntBinaryOperator;


public class MethodReferenceEx {

	public static void main(String[] args) {
		IntBinaryOperator operator;
		operator = new IntBinaryOperator() {
			@Override
			public int applyAsInt(int left, int right) {	//익명구현개체
				return Calulator.staticMethod(left, right);
			}
		};
		int result = operator.applyAsInt(10, 20);
		System.out.println(result);
		
		operator = (int left, int right) -> {	//람다식
			return Calulator.staticMethod(left, right);
		};
		
		operator = (x,y) -> Calulator.staticMethod(x, y);
		result = operator.applyAsInt(10, 20);
		System.out.println(result);
		
		operator = Calulator::staticMethod;	//메소드 참조
		result = operator.applyAsInt(10, 20);
		System.out.println(result);
		
		Calulator calc = new Calulator();
		operator = calc::instanceMethod;	//인스턴스 메소드 참조
											//인스턴스 메소드는 클래스명으로 호출 불가능
		result = operator.applyAsInt(10, 20);
		System.out.println(result);
	}

}
