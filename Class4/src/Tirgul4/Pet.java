package Tirgul4;

public class Pet {
    private String name;
    private String owner;
    private static int counter = 0;

    public Pet() {
        name = "Pet " + ++counter;
    }

    public static int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void play(Human human) {
        System.out.println(this + ": I'm playing now " + human);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}
