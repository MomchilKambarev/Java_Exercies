package ObjectPractice;

class Person {
    String name;
    int age;
    String job;
    int salary;
    String location;


    public void tellName(Person person) {
        System.out.println(person.name);
    }

    int calculateSalary() {
        int yearlySalary = salary * 12;
        return yearlySalary;
    }
}

public class App {
    public static void main(String[] args) {

        Person John = new Person();
        Person Penka = new Person();
        Person Goshko = new Person();

        John.age = 25;
        John.name = "Johnathan";
        System.out.println(John.age);
    }
}
