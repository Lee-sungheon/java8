package Day13;

public class StudentEx {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동", "남자", 30, 20200001);
		Student s2 = new Student();
		s2.setName("김길동");
		s2.setGender("여자");
		s2.setAge(40);
		s2.setsNo(20200002);
		s1.showInfo();
		s2.showInfo();

	}

}
