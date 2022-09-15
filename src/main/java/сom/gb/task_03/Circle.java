package сom.gb.task_03;

public class Circle implements Figure {
    private static final String FIGURE_TYPE = "Окружность";
    private static final double pi = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getFigureType() {
        return FIGURE_TYPE;
    }

    @Override
    public double getArea() {
        return pi * radius;
    }

}
