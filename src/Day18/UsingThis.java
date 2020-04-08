package Day18;

public class UsingThis {
	public int outerField = 10;
	
	class Inner {
		int innerField = 20;
		
		void method() {
			//¶÷´Ù½Ä
			MyFunctional fi = () -> {
				System.out.println("outerField : " + outerField);
				System.out.println("outerField : " + UsingThis.this.outerField);
				System.out.println("innerField : " + innerField);
				System.out.println("innerField : " + this.innerField);
			};
			fi.method();
			
			Functional fi2 = new Functional() {

				@Override
				public void method() {
					System.out.println("outerField : " + outerField);
					System.out.println("outerField : " + UsingThis.this.outerField);
					System.out.println("innerField : " + innerField);
					System.out.println("innerField : " + Inner.this.innerField);
				}
			};
			fi2.method();
		}
	}
}
