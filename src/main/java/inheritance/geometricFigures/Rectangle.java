package inheritance.geometricFigures;

public class Rectangle {

    private int a ;
    private int b ;
    private int area;

    public Rectangle (int a, int b) {
        this.a = a;
        this.b = b;
        //this.area = area;

    }

    public void rectangleArea(int a, int b) {
        area = a * b;
        System.out.println("The area od rectangle is : " + "" + area);
    }
}
