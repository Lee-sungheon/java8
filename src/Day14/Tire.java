package Day14;

public class Tire {
	
	public int maxRotaiton;					//�ִ� ȸ���� (Ÿ�̾� ����)
	public int accumulatedRotation;			//���� ȸ����
	public String location;					//Ÿ�̾� ��ġ
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotaiton = maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotaiton) {
			System.out.println(location + " Tire ����: " + (maxRotaiton - accumulatedRotation) + "ȸ");
			return true;
		}
		else {
			System.out.println("***" + location + " Tire ��ũ ***");
			return false;
		}
	}
}
