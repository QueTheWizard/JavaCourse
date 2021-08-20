package Project;

import java.util.Random;

public abstract class TrafficLights {
    protected int delay;
    private int turns = 0;

    public abstract void switchLight();

    public void check() {
        turns ++;
        if (turns%delay == 0) {
            switchLight();
        }
    }
    public TrafficLights(Junction junc) {
        Random random = new Random();
        delay = random.nextInt(3) + 2;
    }
    public Road getCurrentGreen(){
        return getCurrentGreen();
    }
    public setCurrentGreen(Road road) {
        this.road = Road;
    }

    public setCurrentGreen(Road road) {
        this.road = Road;
    }

    public int getDelay() {
        return delay;
    }
    public int getTurns() {
        return turns;
    }
}
