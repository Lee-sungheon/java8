package Day12;

public class Calculator {
	
	boolean power = false;
	
	//�޼ҵ�
	void powerOn() {
		System.out.println("������ �մϴ�.");
		power = true;
	}
	
	int plus(int x, int y) {
		if(power == true)
		{
			int result = x + y;
			return result;
		}
		else
			return 0;
	}
	
	int plus(long x, long y) {
		if(power == true)
		{
			int result = (int)x + (int)y + 10000;
			return result;
		}
		else
			return 0;
	}
	
	double divide(int x, int y) {
		if(power == true)
		{
			double result = (double)x/y;
			return result;
		}
		else
			return 0;
	}
	
	void powerOff() {
		System.out.println("������ ���ϴ�.");
		power = false;
	}
	
}
