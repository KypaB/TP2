package com.bogger.KypaB.Kolan;


import java.util.*;

public class Truck extends Vehicle {
	public Truck(int number) {
		super(number);
	}
	
	public Truck(int number, double x , double y, double weight) {
		super(number, x, y, weight);
	}

	public void print(ArrayList<Truck> truckList) {
		for(Truck t : truckList) {
			System.out.print(t.get_number() + " ");
			System.out.print(t.get_x() + " ");
			System.out.print(t.get_y() + " ");
			System.out.println(t.get_load());
		}
	}
}
