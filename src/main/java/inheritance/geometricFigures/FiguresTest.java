package inheritance.geometricFigures;

public class FiguresTest {

    public static void main(String[] args) {

        Rectangle figura1 = new Rectangle(5,10);
        figura1.rectangleArea(2,5);

        NextFigure figura2 = new NextFigure(3,2,6);
        figura2.anotherFigure(2,4,6);

        NextFigure2 figura3 = new NextFigure2(2,9,2,5);
        figura3.uglyFigure(3,5,9,6);

    }
}
