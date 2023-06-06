package composition.room;

public class RoomTest {

    public static void main(String[] args) {

        TV tv = new TV("B56V", "SONY", 64, new TvResolution(3100, 2050));
        Table table = new Table("wood", "round");

        RoomWindow roomWindow = new RoomWindow("oak", "brown");
        RoomDimension roomDimension = new RoomDimension(30, 10, 3.5);

        SingleRoom singleRoom = new SingleRoom(table, roomWindow, tv, roomDimension);
        singleRoom.tvTech();
        singleRoom.roomWinTypeEquiped();
        table.quality("Italy");
    }
}

