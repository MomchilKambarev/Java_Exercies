package OOP.FirstExercise;

public class Square extends AbstractShape{

    @Override
    public double getArea(double side) {
        return side * side;
    }

    @Override
    public double getPerimeter(double side) {
        return side * 4;
    }

}
