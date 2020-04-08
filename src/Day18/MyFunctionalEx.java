package Day18;

public class MyFunctionalEx {

	public static void main(String[] args) {
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();
		inner.method();
		
		UsingLocalVariable use = new UsingLocalVariable();
		use.method(3);

	}

}
