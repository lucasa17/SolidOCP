package model;

import java.util.ArrayList;
import java.util.List;

public class AreaCalculator {

	private List<String> areas = new ArrayList<String>();

	public double calculateArea(Object shape) {

		Double area = 0.0;

		if (shape instanceof Rectangle) {

			Rectangle rectangle = (Rectangle) shape;

			area = rectangle.getWidth() * rectangle.getHeight();

			areas.add(String.format("Retângulo l: %.2f a: %.2f = %.2f", rectangle.getWidth(), rectangle.getHeight(), area));

			return area;
		} else if (shape instanceof Circle) {

			Circle circle = (Circle) shape;
			
			area = Math.PI * Math.pow(circle.getRadius(), 2);
			
			areas.add(String.format("Círculo r: %.2f = %.2f", circle.getRadius(), area));
			
			return area;
		} else if (shape instanceof Square) {

			Square square = (Square) shape;
			
			area = square.getSide() * square.getSide();
			
			areas.add(String.format("Quadrado l: %.2f = %.2f", square.getSide(), area));
			
			return area;
		}

		return area;
	}
	
	public List<String> getAreas() {
		return new ArrayList<String>(areas);
	}
}
