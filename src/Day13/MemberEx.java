package Day13;

public class MemberEx {

	public static void main(String[] args) {
		Member mb = new Member("홍길동","hong");
		MemberService ms = new MemberService();
		mb.password = "12345";
		mb.age = 30;
		
		if(ms.login(mb.id, mb.password)) {
			System.out.println("로그인하셨습니다.");
			ms.logout(mb.id);
		}
		else
			System.out.println("정보를 잘못 입력하셨습니다.");
		
		Member lee = new Member("이연희", "lee");
		lee.password = "12345";
		lee.age = 20;
		
		if(ms.login(lee.id, lee.password)) {
			System.out.println("로그인하셨습니다.");
			ms.logout(lee.id);
		}
		else
			System.out.println("정보를 잘못 입력하셨습니다.");
		
	}

}
