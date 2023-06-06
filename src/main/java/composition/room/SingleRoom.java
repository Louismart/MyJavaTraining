package composition.room;

public class SingleRoom {

    private Table table;
    private RoomWindow roomWindow;
    private TV tv;
    private RoomDimension roomDimension;

    public SingleRoom(Table table, RoomWindow roomWindow, TV tv, RoomDimension roomDimension) {
        this.table = table;
        this.roomWindow = roomWindow;
        this.tv = tv;
        this.roomDimension = roomDimension;
    }

    public void tvTech() {
        tv.powerUp();
        tv.techParameters(18, "Android", true);

    }
    public void roomWinTypeEquiped() {
        getRoomWindow().isAntiBulletDefense(true);

    }

    public Table getTable() {
        return table;
    }

    public RoomWindow getRoomWindow() {
        return roomWindow;
    }

    public TV getTv() {
        return tv;
    }

    public RoomDimension getRoomDimension() {
        return roomDimension;
    }
}
