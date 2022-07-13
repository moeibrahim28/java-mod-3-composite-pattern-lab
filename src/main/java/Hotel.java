import java.util.ArrayList;
import java.util.List;

public class Hotel implements HotelRoomInterface{
    private final List<HotelFloor> hotelFloors;

    public Hotel() {
        this.hotelFloors = new ArrayList<HotelFloor>();
    }

    public void addFloor(HotelFloor hotelFloor) {
        hotelFloors.add(hotelFloor);
    }


    @Override
    public void book(String guestName, int roomNumber) {
        Logger.getInstance().log("Booked room#"+roomNumber+" for " + guestName);
    }

    @Override
    public void clean() {
        Logger.getInstance().log("Cleaned room");
    }

}


