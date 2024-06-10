package OOP.ThirdExercise;

public class American extends Person{
    public American(String name, String sex, String religion, String languageSpoken,
                    String job, String nationality, String EGN, String countryOfResidence) {
        super(name, sex, religion, languageSpoken, job, nationality, EGN, countryOfResidence);
    }

    public void eatingHamburgers() {
        System.out.println("Eating hamburgers with joy");
    }

    public void celebrateThanksgiving() {
        System.out.println("I am celebrating Thanksgiving!");
    }
}
