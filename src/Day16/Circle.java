package Day16;

public class Circle {

	static final double PI = 3.14;
	double area;
	int r;
	
	public Circle(int r) {
		this.r = r;
	}
	
	double area() {
		area = PI*r*r;
		return area;
	}
	String showCircle() {
		return "Radius : " + area();
	}
}
