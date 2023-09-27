package edu.monmouth.shape;

public class Main {
	
	public static void main(String[] args) {
		Circle circle;
		Rectangle rectangle;
		Shape shape1, shape2;

		circle = new Circle();
		circle.setRadius(12);
		rectangle = new Rectangle(21, 34);
		shape1 = new Circle(90);
		shape2 = new Rectangle(2, 4);
		
		System.out.println(circle.area());

	}
}
