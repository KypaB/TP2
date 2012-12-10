package com.bogger.KypaB.Kolan;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Car> carList = new ArrayList<Car>();
		for(int i = 0 ; i < 1; i++) {
			int number = in.nextInt();
			double x = in.nextDouble();
			double y = in.nextDouble();
			double weight = in.nextDouble();
			if(weight > 1000) {
				System.out.println("Too much load for the car !");
			} else {
				Car car = new Car(number, x, y , weight);
				carList.add(car);
			}
		}
		
		ArrayList<Truck> truckList = new ArrayList<Truck>();
		for(int i = 0 ; i < 1; i++) {
			int number = in.nextInt();
			double x = in.nextDouble();
			double y = in.nextDouble();
			double weight = in.nextDouble();
			if(weight > 20000) {
				System.out.println("Too much load for the truck !");
			} else {
				Truck truck = new Truck(number, x, y , weight);
				truckList.add(truck);
			}
		}
		
		Car car = new Car(11);
		car.print(carList);
		
		Truck truck = new Truck(11);
		truck.print(truckList);
	}
}
