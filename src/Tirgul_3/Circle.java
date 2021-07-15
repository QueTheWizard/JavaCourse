package Tirgul_3;

public class Circle {
	private float radius;
	private float centerX;
	private float centerY;
	
	final float myPi = 3.14f;
	
	public Circle() {
		radius = 0.f;
		centerX = 0.f;
		centerY = 0.f;
	}

	public Circle(float r, float x, float y) {
		radius = r;
		centerX = x;
		centerY = y;
	}
	
	

	/**
	 * @param radius
	 * @param centerX
	 * @param centerY
	 */
	public Circle(Circle m) {
		
		radius = m.radius;
		centerX = m.centerX;
		centerY = m.centerY;
	}

	public float calcArea()
	{
		return (myPi * radius * radius);
	}
	
	public float calcCircum()
	{
		return (2.0f * myPi * radius);
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public float getCenterX() {
		return centerX;
	}

	public void setCenterX(float centerX) {
		this.centerX = centerX;
	}

	public float getCenterY() {
		return centerY;
	}

	public void setCenterY(float centerY) {
		this.centerY = centerY;
	}



}
