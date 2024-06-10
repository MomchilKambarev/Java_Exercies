package OOP.FirstExercise;

import java.lang.Math;

public class Circle extends AbstractShape{

    public double getArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}
