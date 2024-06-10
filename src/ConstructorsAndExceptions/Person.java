package ConstructorsAndExceptions;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Person cenko = new Person("Cenko Chokov", 44);
        Person jeko = new Person("Jeko", 29);
        System.out.println("Cenko's name is " + cenko.getName() + " and his age is " + cenko.getAge());
        System.out.println("Jeko's name is " + jeko.getName() + " and his age is " + jeko.getAge());
    }
}
