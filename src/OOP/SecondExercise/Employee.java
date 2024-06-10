package OOP.SecondExercise;

public class Employee {
    final int id;
    final String firstName;
    final String lastName;
    double salaryPerMonth = 0;

    public Employee(int id, String firstName, String lastName, double salaryPerMonth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salaryPerMonth = salaryPerMonth;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public double getAnnualSalary() {
        return salaryPerMonth * 12;
    }

    public double raiseSalary() {
        salaryPerMonth *= 1.2;
        return salaryPerMonth;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee name: ").append(getName());
        sb.append("\n");
        sb.append("Employee annual salary ").append(getAnnualSalary());
        return sb.toString();
   }

}
