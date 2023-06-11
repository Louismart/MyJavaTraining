package inheritance.geometricFigures;

public class NextFigure2 extends NextFigure {

    private int d;
    private int total;

    public NextFigure2(int a, int b, int c, int d) {
        super(a, b, c);
        this.d = d;
    }
    public void uglyFigure(int a, int b, int c , int d) {
        total = (a * b) + (c * d);
        System.out.println("Figura 3, total: " + "" + total);
    }
}
