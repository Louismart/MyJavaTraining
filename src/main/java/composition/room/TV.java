package composition.room;

public class TV {

    private String model;
    private String manufacturer;
    private int inch;
    private TvResolution tvResolution;

    public TV(String model, String manufacturer, int inch, TvResolution tvResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.inch = inch;
        this.tvResolution = tvResolution;
    }
    public void powerUp() {
        powerTurnOn();
        internetIsConnected();
        tvResolution.screenQuality("4K");
    }

    public void techParameters(int weight , String oS, boolean onWallInstalled) {
        System.out.println("TV weight kg: " + weight + " OS " + oS + " onWallInstalled " + onWallInstalled);
    }
    private void internetIsConnected() {
        System.out.println("The TV internet is connected");
    }

    private void powerTurnOn() {
        System.out.println("The TV power is ON");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    public TvResolution getTvResolution() {
        return tvResolution;
    }

    public void setTvResolution(TvResolution tvResolution) {
        this.tvResolution = tvResolution;
    }
}
