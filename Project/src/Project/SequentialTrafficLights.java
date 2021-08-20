package Project;

import java.util.ArrayList;

public class SequentialTrafficLight extends TrafficLights {
    private int count = 0;

    public SequentialTrafficLight(Junction juncofTrafficLight) {
        super(juncofTrafficLight);
        System.out.println(this);
    }


    public SequentialTrafficLight() {
        super();
    }

    public void switchLight() {
        setCurrentGreen(addIncomingRoad().get(count));
        if (count <= juncofTrafficLight.getEnteringRoad().size() - 1) {
            count++;
        } else
            count = 0;
    }

    public String toString() {
        return "Sequential TrafficLight " + juncofTrafficLight + ", delay =  " +
                delay + ": green light on " + getCurrentGreen;
    }
}