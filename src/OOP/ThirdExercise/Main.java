package OOP.ThirdExercise;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person momchi = new Person("Momchil", "male",
                "Orthodox", "Bulgarian", "QA",
                "BG", "8711035020","Bulgaria");

        Person lachko = new Bulgarian("Lachko", "male", "Orthodox", "Bulgarian",
                "Accountant", "Bulgarian", "8706266689", "USA");

        Person dete = new Child("Cecko", "male", "Orthodox", "Bulgarian",
                null, "Bulgarian", "2151126585", "Bulgaria");
//        System.out.println(momchi.sex);
//        System.out.println(momchi.age);
//        System.out.println(momchi.isAdult());
//        System.out.println(momchi.canTakeLoan());
//        System.out.println(momchi.religion);
//        System.out.println(momchi.celebrateEaster());
//        System.out.println(momchi.toString());
//        System.out.println(momchi.languageSpoken);
//        momchi.sayHello();

        executePersonActions(lachko);
        executePersonActions(dete);
    }

    private static void executePersonActions(Person person) {
        System.out.println("===============================================================\n");
        System.out.println("Execute actions for class " + person.getClass().getSimpleName());
        System.out.println(person.toString());
        person.celebrateEaster();
        person.sayHello();
        person.canTakeLoan();
        person.isAdult();

        if (person instanceof American){
            ((American) person).celebrateThanksgiving();
        } else if (person instanceof  Bulgarian) {
            ((Bulgarian) person).danceHoro();
        } else if (person instanceof  Italian) {
            ((Italian) person).makePizza(Arrays.asList("Tomato sauce", "Testo", "Mozzarella", "Ventrichina"));
        } else if (person instanceof Child) {
            ((Child) person).playing("ball");
        }
    }

}
