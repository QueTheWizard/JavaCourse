package Tirgul4;

public class Cat extends Pet {
    private String color;

    public Cat() {
        super();
        color = "Black";
    }

    @Override
    public String toString() {
        return super.toString() + " color=" + color;
    }
}
