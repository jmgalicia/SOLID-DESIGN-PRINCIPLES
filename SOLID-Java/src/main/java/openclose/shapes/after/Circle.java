package openclose.shapes.after;

public class Circle implements Shape
{
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	private double radius;

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	@Override
	public double getArea()
	{
		return radius * radius * Math.PI;
	}

}
