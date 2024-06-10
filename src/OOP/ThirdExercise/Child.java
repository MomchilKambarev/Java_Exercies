package OOP.ThirdExercise;

public class Child extends Person {
    public Child(String name, String sex, String religion, String languageSpoken, String job,
                 String nationality, String EGN, String countryOfResidence) {
        super(name, sex, religion, languageSpoken, job, nationality, EGN, countryOfResidence);
    }

    @Override
    public boolean isAdult() {
        return false;
    }

    @Override
    public boolean canTakeLoan() {
        return false;
    }

    public void playing(String toy) {
        System.out.println("Playing with " + toy);
    }
}
