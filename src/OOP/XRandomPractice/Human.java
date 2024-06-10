package OOP.XRandomPractice;

public class Human {

    String name;
    String eyeColor;
    int age;
    int height;

    public Human(String name, String eyeColor, int age, int height) {
        super();
        this.name = name;
        this.eyeColor = eyeColor;
        this.age = age;
        this.height = height;
    }

    public void eating() {
        System.out.println("eating...");
    }

    public void speaking() {
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + age + "years old");
        System.out.println("My eyes are " + eyeColor + "color");
        System.out.println("I am " + height + "cm tall");
    }

    public void walking() {
        System.out.println("walking...");
    }
}
