package Project;

import java.util.ArrayList;

public class Junction extends Point {
    private ArrayList<Road> incomingRoads = new ArrayList<Road>();
    private ArrayList<Road> outgoingRoads = new ArrayList<Road>();
    private static int counter = 1;
    private int id;
    private TrafficLights tl = null;

    public ArrayList<Road> getIncomingRoads() {
        return incomingRoads;
    }

    public Junction() {
        super();
        id = counter++;
    }

    public void addIncomingRoad(Road r) {
        incomingRoads.add(r);
    }

    public void addOutgoingRoads(Road r) {
        outgoingRoads.add(r);
    }

    public void setTrafficLights(TrafficLights tl) {
        this.tl = tl;
    }

}
