package Day16;

public class Course<T> {
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[])(new Object[capacity]);	
	}
	
	public String getname() {
		return name;
	}
	public T[] getStudents() {
		return students;
	}
	public void add(T t) {	//�迭�� ����ִ� �κ��� ã�Ƽ� �������� �߰��ϴ� �޼ҵ�
		for(int i=0 ; i<students.length ; i++) {
			if(students[i]==null) {
				students[i] = t;
				break;
			}
		}
	}
}