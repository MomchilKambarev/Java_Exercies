package Lecture7ConstructorsAndExceptions;

public class Car {
   private String name;
   private String color;
   private int releaseYear;
   private int horsePower;
   private boolean secondHand;

    public Car(String name, String color, int releaseYear, int horsePower, boolean secondHand) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHand = secondHand;
    }

    public Car(String name, String color, boolean secondHand) {
        this.name = name;
        this.color = color;
        this.releaseYear = -1;
        this.horsePower = -1;
        this.secondHand = secondHand;
    }


    public Car(String name, String color, int releaseYear, int horsePower) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
    }

    public Car(String name, int releaseYear, int horsePower, boolean secondHand) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHand = secondHand;
    }

    public Car() {

    }

    public static void main(String[] args) {
        Car golf = new Car("volkswagen", "silver metallic", 1996, 115, true );
        System.out.println(golf.horsePower);


        Car bmw = new Car("third series", "black", true);
        System.out.println(bmw.name);

        Car chevy = new Car("Chavelle", "Black", 1969, 450);
        System.out.println(chevy.name);

        Car mustang = new Car("Mustang", 2021, 350, false);
        System.out.println(mustang.name);

    }

    }
