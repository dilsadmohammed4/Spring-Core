package com.springcore.ci;

public class Addition {
	private int x;
	private int y;

	public Addition(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Const. (Int , Int)");
	}

	public Addition(double x, double y) {
		this.x = (int) x;
		this.y = (int) y;
		System.out.println("Const. (Double , Double)");
	}

	public Addition(String x, String y) {
		this.x = Integer.parseInt(x);
		this.y = Integer.parseInt(y);
		System.out.println("Const. (Sting , String)");

	}

	public void doSum() {
		System.out.println("x is "+this.x);
		System.out.println("y is "+this.y);
		System.out.println("Sum is " + (this.x + this.y));
	}
}