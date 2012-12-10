package com.bogger.KypaB.Kolan;

import java.util.*;

public class Car extends Vehicle{
	public Car(int number) {
		super(number);
	}
	
	public Car(int number, double x , double y, double weight) {
		super(number, x, y, weight);
	}

	public void print(ArrayList<Car> carList) {
		for(Car c : carList) {
			System.out.print(c.get_number() + " ");
			System.out.print(c.get_x() + " ");
			System.out.print(c.get_y() + " ");
			System.out.println(c.get_load());
		}
	}
}
