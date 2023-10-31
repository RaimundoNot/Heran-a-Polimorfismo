package entities;

import entities.enums.Color;

public class Rectangle extends Shape{

	private Double width;
	private Double Height;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		Height = height;
	}
	
	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return Height;
	}

	public void setHeight(Double height) {
		Height = height;
	}

	@Override
	public double area() {
		return width * Height;
	}

}
