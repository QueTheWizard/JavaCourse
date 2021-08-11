package Project;

import java.util.ArrayList;

public class Junction extends Point {
//    private ArrayList<Road> incomingRoads;
//    private ArrayList<Road> outgoingRoads;
    private static int counter = 1;
    private int id;
    private TrafficLights tl;

    public Junction() {
        super();
        id = counter++;
    }

}
