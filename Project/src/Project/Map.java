package Project;

import java.util.ArrayList;

public class Map {
    private ArrayList<Junction> juncs = new ArrayList<Junction>();
    private ArrayList<Road> road = new ArrayList<Road>();

    public Map(int numOfJunc) {
        for (int i = 0; i < numOfJunc; i++) {
            juncs.add(new Junction());
        }
        createRoads();
    }

    public void createRoads() {

    }
}
