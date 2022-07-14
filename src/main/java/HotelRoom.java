import java.util.ArrayList;
import java.util.List;

class HotelRoom implements HotelRoomInterface {
    private List<RoomCheckinObserver> checkinObservers = new ArrayList<RoomCheckinObserver>();
    private int roomNumber;

    public HotelRoom(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void book(String guestName, int roomNumber) {
        Logger.getInstance().log("Booked room# " + roomNumber+ " for " + guestName);
    }



    public void clean() {
        Logger.getInstance().log("Cleaned room");
    }

    public void addCheckinObserver(RoomCheckinObserver checkinObserver) {
        checkinObservers.add(checkinObserver);
    }

    public void removeCheckinObserver(RoomCheckinObserver checkinObserver) {
        checkinObservers.remove(checkinObserver);
    }

    public void checkIn(String guestName) {
        Logger.getInstance().log(guestName + " checked in");
        checkinObservers.forEach((checkinObserver -> checkinObserver.update(guestName)));
    }
}