package Tirgul4;

public class MainClass {
    public static void main(String[] args) {
        Pet p1 = new Pet();

        Pet p2 = new Pet();

        Human yossi = new Human();

        yossi.adoptPet(p1);
        yossi.adoptPet(p2);
        yossi.playWithPets();

        Cat cat = new Cat();
        cat.play(yossi);


    }
}
