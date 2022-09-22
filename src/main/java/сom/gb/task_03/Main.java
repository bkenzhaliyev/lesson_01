package сom.gb.task_03;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {new Circle(12)
                , new Square(10)
                , new Triangle(5, 8, 5)
        };

        for (Figure figure : figures)
            System.out.println("Фигура - " + figure.getFigureType() + ": Площадь = " + figure.getArea());
    }
}
