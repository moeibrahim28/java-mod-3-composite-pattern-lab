import java.util.ArrayList;
import java.util.List;

class HotelFloor implements HotelRoomInterface {
    private int floorNumber;
    private final List<HotelRoomInterface> hotelRooms = new ArrayList<HotelRoomInterface>();

    public HotelFloor(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void book(String guestName, int roomNumber) {
        hotelRooms.forEach(child -> {
            child.book(guestName, roomNumber);
        });
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void clean() {
        hotelRooms.forEach(child -> child.clean());
    }

    public void addHotelRoom(HotelRoomInterface hotelRoom) {
        hotelRooms.add(hotelRoom);
    }

    public void removeHotelRoom(HotelRoomInterface hotelRoom) {
        hotelRooms.remove(hotelRoom);
    }

}