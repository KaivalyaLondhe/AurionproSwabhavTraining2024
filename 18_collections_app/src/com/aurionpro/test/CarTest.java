package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.model.Car;

public class CarTest {

	static Scanner scanner = new Scanner(System.in);
	static int index=0;

	private static void inputFromUser(List<Car> cars) {
		System.out.println("Enter the number of cars you wish to add");
		int size = scanner.nextInt();
		int count = 1;
		while (cars.size() < size) {

			System.out.println("Enter the details for Car: " + count);
			System.out.println("Enter the carID");
			int carId = scanner.nextInt();
			System.out.println("Enter the company name");
			String companyName = scanner.next();
			System.out.println("Enter the price");
			double price = scanner.nextDouble();
			System.out.println("Enter the mileage");
			double mileage = scanner.nextDouble();
			maxMileage(cars, mileage);
			cars.add(new Car(carId, companyName, price, mileage));
			count++;
		}
		System.out.println("All the cars are listed below");
		displayAllCars(cars);
	}

	private static void displayAllCars(List<Car> cars) {
		for (Car car : cars)
			System.out.println(car);

	}

	@SuppressWarnings("unlikely-arg-type")
	private static double maxMileage(List<Car> cars , double mileage) {
		double maxMileage = 0;
		if (mileage > maxMileage) {
			maxMileage = mileage;
			index = cars.indexOf(maxMileage);
		}
		return index;

	}

	public static void main(String[] args) {

		List<Car> cars = new ArrayList<Car>();
		inputFromUser(cars);
		cars.get(index);

	}
}
