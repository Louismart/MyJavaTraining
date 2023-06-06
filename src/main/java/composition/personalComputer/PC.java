package composition.personalComputer;

import composition.personalComputer.Case;
import composition.personalComputer.Monitor;
import composition.personalComputer.Motherboard;

public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo() {
        //fancy graphic
        monitor.drawPixelAt(1200, 50, "yellow");

    }
}
