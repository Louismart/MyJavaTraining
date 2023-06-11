package inheritance.Phone;

public class SmartPhone extends CellPhone {

    private String operationSystem;

    public SmartPhone(int year, int hour, String operationSystem) {
        super(year, hour);
        this.operationSystem = operationSystem;
    }

    public void install(String program) {
        System.out.println("Installing " + program + " "+ "for" + " "+ operationSystem);
    }
    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }
}
