package composition.room;

public class RoomWindow {

    private String stuff;
    private String color;

    public RoomWindow(String stuff, String color) {
        this.stuff = stuff;
        this.color = color;
    }

    public void isAntiBulletDefense(boolean antiBullet) {
        System.out.println(" The windows with antibullet glasses " + antiBullet);
    }

    public String getStuff() {
        return stuff;
    }

    public void setStuff(String stuff) {
        this.stuff = stuff;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
