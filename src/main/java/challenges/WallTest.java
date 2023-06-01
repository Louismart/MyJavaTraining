package challenges;

public class WallTest {
    public static void main(String[] args) {

        Wall wall = new Wall(2, 4);
        System.out.println("Area = " + wall.getArea());
        System.out.println("");

        wall.setWidth(1.5);
        wall.setHeight(5);
        System.out.println("Width = " + wall.getWidth());
        System.out.println("Height = " + wall.getHeight());
        System.out.println("Area = " + wall.getArea());

    }

}
