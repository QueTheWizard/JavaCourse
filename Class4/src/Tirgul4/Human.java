package Tirgul4;

import java.util.ArrayList;

public class Human {
    private String name;
    private ArrayList<Pet> pets = new ArrayList<Pet>();

    public Human() {
        this("Yossi");
    }

    public Human(String name) {
        this.name = name;
    }

    public void adoptPet(Pet p) {
        pets.add(p);
        p.setOwner(name);
    }

    public void playWithPets() {
        for (Pet pet : pets) {
            pet.play(this);
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }
}
