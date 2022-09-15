package сom.gb.task_03;

public class Square implements Figure{
    private static final String FIGURE_TYPE = "Квадрат";
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public String getFigureType() {
        return FIGURE_TYPE;
    }

    @Override
    public double getArea() {
        return length * 4;
    }

}
