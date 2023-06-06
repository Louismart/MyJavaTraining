package composition.room;

public class TvResolution {

    private int width;
    private int height;

    public TvResolution(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public void screenQuality(String screenQ) {
        System.out.println("Screen quality is: " + screenQ);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
