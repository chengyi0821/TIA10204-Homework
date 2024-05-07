package hw5;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle e = new MyRectangle(10, 20);
		e.getArea();
	}
}

class MyRectangle {
	private double width;
	private double depth;

	public MyRectangle() {};
	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}

	public void getArea() {
		System.out.println("Area為" + width * depth);
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getWidth() {
		return width;
	}

	public double getDepth() {
		return depth;
	}
}
