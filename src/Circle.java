import java.io.ObjectInputStream.GetField;

public class Circle {
	private double radius;
	private final double PI = 3.14159;

	public Circle(double radiusGiven) {
		radius = radiusGiven;
	}

	public Circle() {
		radius = 0.0;
	}

	public void setRadius(double radiusGiven) {
		radius = radiusGiven;

	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return PI * radius * radius;
	}

	public double getDiameter() {
		return 2 * radius;
	}

	public double getCircumference() {
		return 2 * PI * radius;
	}

}
