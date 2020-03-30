package Day12;

public class TV {

	//필드
	String name;
	int year;
	int size;
	
	//생성자
	TV(String name, int year, int size) {
		this.name = name;
		this.year = year;
		this.size = size;
	}
		
	//메소드
	void show() {
		System.out.println(name+"에서 만든 "+year+"년형 "+size+"인치 TV");
		
	}
}
