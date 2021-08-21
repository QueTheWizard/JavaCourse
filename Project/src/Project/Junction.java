package Project;

import java.util.ArrayList;

public class Junction extends Point {
	
	private static int counter = 1;
	private int junc_num;
	private boolean SET_JUNC;
	private Trafficlights tl = null;
	private ArrayList<Road> enteringRoads = new ArrayList<Road>();
	private ArrayList<Road> exitingRoads = new ArrayList<Road>();
	
	
	public Junction() {
		super();
	}
	
	public Junction(int x,int y) {
		super();
	}
	
	private int getjunc() {
		if(!SET_JUNC) {
			junc_num = counter++;
			SET_JUNC = true;
		}
		return junc_num;
	}
	
	public void setTrafficlights(Trafficlights tl) {
		this.tl = tl;
	}
	
	public int getJuncNum() {
		return junc_num;
	}

	public void addEnteringRoads(Road x) {
		enteringRoads.add(x);
	}
	
	public void addExitingRoads(Road x) {
		exitingRoads.add(x);
	}
	
	public ArrayList<Road> getExitingRoads() {
		return exitingRoads;
	}

	public ArrayList<Road> getEnteringRoads() {
		return enteringRoads;
	}	
	
	public void checkLights() {
		if (tl != null) {
			tl.check();
		}
	}

	@Override
	public String toString() {
		return "Junction "+getjunc()+ " at " + super.toString();
	}
	
}
