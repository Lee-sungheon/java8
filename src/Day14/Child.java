package Day14;

public class Child extends Parent{
	Child(){
		super();		//부모를 의미 - 자동 생성됨.
		System.out.println("자식을 생성합니다.");
	}
	
	void method3() {
		System.out.println("자식 메소드3");
	}
	
	@Override
	void method2() { 
		System.out.println("자식 메소드2");
		super.method2();
	}
	
	
}
