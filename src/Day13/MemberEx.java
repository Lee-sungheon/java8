package Day13;

public class MemberEx {

	public static void main(String[] args) {
		Member mb = new Member("ȫ�浿","hong");
		MemberService ms = new MemberService();
		mb.password = "12345";
		mb.age = 30;
		
		if(ms.login(mb.id, mb.password)) {
			System.out.println("�α����ϼ̽��ϴ�.");
			ms.logout(mb.id);
		}
		else
			System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
		
		Member lee = new Member("�̿���", "lee");
		lee.password = "12345";
		lee.age = 20;
		
		if(ms.login(lee.id, lee.password)) {
			System.out.println("�α����ϼ̽��ϴ�.");
			ms.logout(lee.id);
		}
		else
			System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
		
	}

}
