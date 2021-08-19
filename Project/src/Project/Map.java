package Project;

import java.util.ArrayList;
import java.util.Random;

public class Map {
    private ArrayList<Junction> juncs = new ArrayList<Junction>();
    private ArrayList<Road> roads = new ArrayList<Road>();

    public Map(int numOfJunc) {
        for (int i = 0; i < numOfJunc; i++) {
            juncs.add(new Junction());
        }
        createRoads();
        createTrafficLights();
    }

    public void createTrafficLights() {
        Random random = new Random();
        for (Junction junc : juncs) {
            if (junc.getIncomingRoads().size() > 0) {

            }
        }
    }

    public void createRoads() {
        Random r = new Random();
        for (Junction start : juncs) {
            for (Junction end : juncs) {
                if (start != end && r.nextBoolean()) {
                    Road newRoad = new Road(start, end);
                    roads.add(newRoad);
                    start.addOutgoingRoads(newRoad);
                    end.addIncomingRoad(newRoad);
                }
            }
        }
    }
}
