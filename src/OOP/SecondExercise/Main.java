package OOP.SecondExercise;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "John", "Smith", 1000);
        System.out.println(employee1.getAnnualSalary());
        System.out.println(employee1.getName());
        employee1.raiseSalary();
        System.out.println(employee1.getAnnualSalary());
        System.out.println(employee1.toString());


        Employee employee2 = new Employee(2, "Gosho", "Petkov", 2000);
        System.out.println(employee2.getName());


    }
}
