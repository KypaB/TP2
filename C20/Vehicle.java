package com.bogger.KypaB.Kolan;

public class Vehicle implements Loadable {
	private int number;
	private double x,y,weight;
	
	public Vehicle(int number) {
		this.number = number;
	}
	
	public Vehicle(int number, double x , double y, double weight) {
		this.number = number ;
		this.x = x;
		this.y = y;
		this.weight = weight;
	}

	public int get_number() {
		return number;
	}
	
	public double get_x() {
		return x;
	}

	public double get_y() {
		return y;
	}

	public double get_load() {
		return weight;
	}

	@Override
	public void load(double weight) {
		this.weight = weight;
	}
}
