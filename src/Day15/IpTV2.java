package Day15;

public class IpTV2 extends TV implements Internet {

	@Override
	public void webSerch() {
		System.out.println("인터넷 검색");
	}

}
