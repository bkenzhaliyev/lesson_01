package сom.gb.task_03;

public class Triangle implements Figure {
    private static final String FIGURE_TYPE = "Треугольник";
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String getFigureType() {
        return FIGURE_TYPE;
    }

    @Override
    public double getArea() {
        return a * b * c;
    }

}
