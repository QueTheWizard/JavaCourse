package Project;

import java.util.ArrayList;
import java.util.Random;

public class Map {
	
	private ArrayList<Junction> junctions = new ArrayList<Junction>();
	private ArrayList<Road> roads = new ArrayList<Road>();
	
	public Map(int numofjunctions) {
		for(int i=0 ; i<numofjunctions ; i++) {
			junctions.add(new Junction());
		}
		createRoads();
		createTrafficlight();
	}
	
	public Map(ArrayList<Junction> junctions, ArrayList<Road> roads) {
		this.junctions = junctions;
		this.roads = roads;
		createTrafficlight();
	}
	
	public void createRoads() {
		Random r = new Random();
		for (Junction start :junctions) {
			for (Junction end : junctions) {
				if (start!=end && r.nextBoolean()) {
					Road newroad = new Road(start,end);
					roads.add(newroad);
					start.addExitingRoads(newroad);
					end.addEnteringRoads(newroad);
					
				}
			}
		}
	}
	
	public void createTrafficlight() {
		Random r = new Random();
		for (Junction j : junctions) {
			if (j.getEnteringRoads().size() > 0 && r.nextBoolean() && r.nextBoolean()) {
				if(r.nextBoolean()) {
					j.setTrafficlights(new RandomTrafficlights(j));
				}
				else {
					j.setTrafficlights(new SequentialTrafficlight(j));
				}
			}
		}
	}

	public ArrayList<Junction> getJunctions() {
		return junctions;
	}
	
	public ArrayList<Road> calcPath(){
		Junction currentJunction;
		Road currentRoad;
		ArrayList<Road> path = new ArrayList<Road>();
		
		int index = getRandomIndex(junctions.size());
		currentJunction = junctions.get(index);
		
		for (int i = 0; i < 4 ; i++) {
			if (currentJunction.getExitingRoads().size() > 0) {
				index = getRandomIndex(currentJunction.getExitingRoads().size());
				currentRoad = currentJunction.getExitingRoads().get(index);
				path.add(currentRoad);
				currentJunction = currentRoad.getEnd();
			}
		}
		return path;
	}

	private int getRandomIndex(int size) {
		Random r = new Random();
		return r.nextInt(size);
	}
	
	public void checkTrafficLights() {
		for (Junction junction : junctions) {
			junction.checkLights();
		}
	}
}
