package Class8;

public class Person {
    private String typeOfPerson;

    public Person() {
        super();
        typeOfPerson = "OK";
    }

    public Person(String typeOfPerson) {
        super();
        this.typeOfPerson = typeOfPerson;
    }

    public boolean isBum() {
        if (typeOfPerson == "Bum") {
            return (true);
        } else {
            return (false);
        }
    }

    public boolean isBroke() {
        if (typeOfPerson == "Broke") {
            return (true);
        } else {
            return (false);
        }
    }

    public boolean doesNotKnowJava() {
        if (typeOfPerson == "doesNotKnowJava") {
            return (true);
        } else {
            return (false);
        }
    }
}
