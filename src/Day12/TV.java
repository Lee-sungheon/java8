package Day12;

public class TV {

	//�ʵ�
	String name;
	int year;
	int size;
	
	//������
	TV(String name, int year, int size) {
		this.name = name;
		this.year = year;
		this.size = size;
	}
		
	//�޼ҵ�
	void show() {
		System.out.println(name+"���� ���� "+year+"���� "+size+"��ġ TV");
		
	}
}
