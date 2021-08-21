package Project;

import java.util.ArrayList;
import java.util.Random;

public class Vehicle {
	

	private double speed;
	private ArrayList<Road> path;
	private int index;
	private Road currentRoad;
	private double distanceTraveled;
	  
	
	public Vehicle(Map map) {
		Random r = new Random();
		speed = r.nextInt(91) +30;
		path = map.calcPath();
		index = 0;
		distanceTraveled = 0;
		currentRoad = path.get(index);
	}

	public void move() {
		if (index == path.size()) {
			System.out.println("arrived to it's destination:" + currentRoad.getEnd());
		} else {
			distanceTraveled = distanceTraveled + speed;
			nextRoad();
		}
	}
	
	private void nextRoad() {
		if ( distanceTraveled > currentRoad.getLength()) {
			distanceTraveled = distanceTraveled - currentRoad.getLength();
			index++;
			if (index == path.size()) {
				System.out.println("arrived to it's destination:" + currentRoad.getEnd());
			} else {
				currentRoad = path.get(index);
				nextRoad();				
			}
		}
	}
	
	public Road getCurrentRoad() {
		return currentRoad;
	}
}
