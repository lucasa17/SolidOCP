package model;

public class Triangle implements Shape{
	private double base;
	private double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public String getDescription() {
        return String.format("Triângulo b: %.2f a: %.2f", base, height);
    }
}
