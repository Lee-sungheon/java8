package Day12;

public class StringBufferProg {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Java Programing");
		StringBuffer str2;
		
		str2 = str.insert(5,"JSP ");
		System.out.println(str);
		System.out.println(str2);
		
		str.append(" Good ");
		str.append('A');
		System.out.println(str);
		
		str2.reverse();
		System.out.println(str2);
		
		str2.setLength(10);
		System.out.println(str2);
	
	}

}
