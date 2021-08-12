package com.shiva.dtask2;

public class Triangle {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw() {
		System.out.println("PointA : ("+getPointA().getX()+", "+getPointA().getY()+")");
		System.out.println("PointB : ("+getPointB().getX()+", "+getPointB().getY()+")");
		System.out.println("PointC : ("+getPointC().getX()+", "+getPointC().getY()+")");

	}
}
