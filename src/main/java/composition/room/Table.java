package composition.room;

public class Table {

    private String stuff;
    private String shape;

    public Table(String stuff, String shape) {
        this.stuff = stuff;
        this.shape = shape;
    }

    public void quality(String manufacturer) {
        System.out.println("The table is High Quality " + " Made in : " + manufacturer);
    }

    public String getStuff() {
        return stuff;
    }

    public void setStuff(String stuff) {
        this.stuff = stuff;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
}
