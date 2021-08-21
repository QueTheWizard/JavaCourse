package Project;

import java.util.Random;

public class Point {
	
	private final int MAX_X = 800;
	private final int MAX_Y = 600;
	private final int MIN_VAL = 0;
	
	
	private double pointX = 0;
	private double pointY = 0;
	
	
	public Point() {
		Random r = new Random();
		pointX = r.nextInt(MAX_X) + r.nextDouble();
		pointY = r.nextInt(MAX_Y) + r.nextDouble();
		System.out.println("Creating " + this);
	}
	
	public Point(double x,double y) {
		this.pointX = check(x,MIN_VAL,MAX_X);
		this.pointY = check(y,MIN_VAL,MAX_Y);
		if (this.pointX!=x) {
			System.out.println(x + " is illegal value for x and has been replaced with " + this.pointX);
		}
		if (this.pointY!=y) {
			System.out.println(y + " is illegal value for y and has been replaced with " + this.pointY);
		}
		System.out.println("Creating "+ this);
			
	}
	

	
	public double check(double num,int min,int max) {
		Random r = new Random();
		if (num < min || num > max) {
			num = r.nextInt(max-min+1) - r.nextDouble(); 
		}
		return num;
		
		
	}
	
	public double calcDistance(Point other) {
		return Math.sqrt(Math.pow(other.pointX-this.pointX, 2) + Math.pow(other.pointY-this.pointY, 2));	
	}

	@Override
	public String toString() {
		return "Point (" + pointX + ", " + pointY + ")";
	}
	
}
