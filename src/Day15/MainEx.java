package Day15;

import Day15.A.C;

public class MainEx {

	public static void main(String[] args) {
		A.C.field2 = 10;		//static 멤버는 객체 없이 사용 가능
		A.C.method2();
		A.C c = new A.C();
		c.field1 = 10;
		C.field2 = 10;
		c.method1();
		C.method2();
		
		A a = new A();
		A.B b = a.new B();		//인스턴스 멤버 클래스의 객체화
		b.field1 = 10;
		b.method1();
		
		a.method();				//로컬클래스 D를 사용하는 메소드;
		
	}

}
