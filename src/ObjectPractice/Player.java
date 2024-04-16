package ObjectPractice;

public class Player extends Person{

    public static void main(String[] args) {
        Person Qnko = new Person();
        Qnko.name = "Qnislavocho";
        Qnko.tellName(Qnko);
        Qnko.salary = 3000;
        System.out.println(Qnko.calculateSalary());

    }

}
