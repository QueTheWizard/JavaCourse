package Project;

import java.util.ArrayList;

public class DrivingGame {
	
	private ArrayList<Vehicle> vehicles;
	private Map map;
	
	public DrivingGame(int numOfJunctions, int numOfVehicles) {
		map = new Map(numOfJunctions);
		vehicles = new ArrayList<Vehicle>();
		for (int i = 0; i < numOfVehicles; i++) {
			Vehicle car = new Vehicle(map);
			vehicles.add(car);
		}
	}
	
	public void play(int turns) {
		for(int i = 0; i < turns; i++) {
			System.out.println("turn " + (i+1));
			for(Vehicle car : vehicles) {
				System.out.println("vehicle " + (vehicles.indexOf(car) + 1) + " is moving on the " + car.getCurrentRoad());
				car.move();
			}	
			map.checkTrafficLights();
		}
	}

}
