package Project;

public class Road {
    private Junction start;
    private Junction end;
    private double len;

    public Road() {
        this.start = start;
        this.end = end;
        len = start.calcDistance(end);
    }
}
