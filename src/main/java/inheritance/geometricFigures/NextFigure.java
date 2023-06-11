package inheritance.geometricFigures;

public class NextFigure extends Rectangle {

    private int c;
    private int total;

    public NextFigure(int a, int b, int c) {
        super(a, b);
        this.c = c;
        this.total = total;
    }
    public void anotherFigure (int a, int b , int c) {
        total = a * b * c;
        System.out.println("Figura 2, total is : " + "" + total);
    }
}
