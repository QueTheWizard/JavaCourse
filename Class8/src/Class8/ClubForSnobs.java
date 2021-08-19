package Class8;


public class ClubForSnobs {

    void gateKeeper(Person candidate) throws GetOuttaHereException {
        if (candidate.isBum()) {
            throw new GetOuttaHereException("You're a bum!");
        }
        if (candidate.isBroke()) {
            throw new GetOuttaHereException("You're broke!!!");
        }
        if (candidate.doesNotKnowJava()) {
            throw new GetOuttaHereException("You're a bum!");
        }
    }


    void joinClub(Person candidate) {
        try {
            gateKeeper(candidate);
        } catch (GetOuttaHereException e) {
            System.out.println("No, you can't join the club because " + e.getMessage());
            return;
        }

        System.out.println("Welcome to the club!");
    }


    public static void main(String[] args) {

        ClubForSnobs snobs = new ClubForSnobs();

        Person candidate = new Person("BuM");
//		Person candidate = new Person("OK");

        snobs.joinClub(candidate);

    }

}

