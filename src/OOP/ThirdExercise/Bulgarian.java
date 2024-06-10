package OOP.ThirdExercise;

public class Bulgarian extends Person{

    public Bulgarian(String name, String sex, String religion, String languageSpoken, String job, String nationality, String EGN, String countryOfResidence) {
        super(name, sex, religion, languageSpoken, job, nationality, EGN, countryOfResidence);
    }

    public void eatLutenica() {
        System.out.println("I love eating Lutenica from tomatoes");
    }

    public void danceHoro() {
        System.out.println("Танцувам хоро!");
    }
}
