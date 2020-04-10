package Day20;

public class DataBox {
	private String data;
	
	public synchronized String getData() {
		if(this.data == null) {	//data�ʵ尡 null�̸� �Һ��� �����带 �Ͻ����� ���·� ����
			try { wait(); } catch(InterruptedException e) {}
		}
		String returnValue = data;
		System.out.println("Consumer Thread�� ���� ������ : " + returnValue);
		data = null;	//data �ʵ带 null�� ����� ������ �����带 ���� ��� ���·� ����
		notify();
		return returnValue;
	}
	
	public synchronized void setData(String data) {
		if(this.data != null) {	//data �ʵ尡 null�� �ƴϸ� ������ �����带 �Ͻ� ���� ���·� ����
			try { wait(); } catch(InterruptedException e) {}
		}
		this.data = data;	//data �ʵ忡 ���� �����ϰ� �Һ��� �����带 ���� ��� ���·� ����
		System.out.println("ProducerThread�� ������ ������ : " + data);
		notify();
	}
}