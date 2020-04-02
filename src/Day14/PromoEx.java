package Day14;

public class PromoEx {
	public static void main(String[] args) {
		
		PromoChild pc = new PromoChild();
		pc.method1();
		pc.method2();
		pc.method3();
		
		PromoParent pp = pc;		//�ڽ��� �θ� ������ ���� (�ڵ� ����ȯ)
		pp.method1();
		pp.method2();
//		pp.method3();			//�θ��� �����̱� ������ �θ𿡴� method3�� ���°� �����Ƿ� ���� �ȵ�
		
		pc = (PromoChild)pp;	//�ڽĿ� �θ� ������ �� ���� But ��������ȯ�� ����
		pc.method1();			//�θ��� ��ü�� �ڽ��� ��ü�� ���Ե� ���� �������� �ڽ� ��ä����߸� ��
		pc.method2();
		pc.method3();
		
		PromoParent pp2 = new PromoParent();
		if(pp2 instanceof PromoChild)	//instanceof�� ����ȯ�� �������� boolean������ ��ȯ 
			pc = (PromoChild)pp2;	//���� ����ȯ�� ������ ���·θ� ������ ������
		else
			System.out.println("��������ȯ�� ����� �� �����ϴ�.");
	}
}
