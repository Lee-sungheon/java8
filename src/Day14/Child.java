package Day14;

public class Child extends Parent{
	Child(){
		super();		//�θ� �ǹ� - �ڵ� ������.
		System.out.println("�ڽ��� �����մϴ�.");
	}
	
	void method3() {
		System.out.println("�ڽ� �޼ҵ�3");
	}
	
	@Override
	void method2() { 
		System.out.println("�ڽ� �޼ҵ�2");
		super.method2();
	}
	
	
}
