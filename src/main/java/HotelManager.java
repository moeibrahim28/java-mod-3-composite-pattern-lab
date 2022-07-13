public class HotelManager {
    public static void main(String[] args) {
        Logger.getInstance().log("Managing hotel...");
        int NUMBER_OF_BOOKINGS = 25;
        int NUMBER_OF_ROOMS_PER_FLOOR = 5;
        int ROOMS_ON_FLOOR_COUNTER = 0;
        int floorCounter=1;
        Hotel hotel = new Hotel();
        HotelFloor hotelFloor = new HotelFloor();
        for (int i = 0; i < NUMBER_OF_BOOKINGS; i++) {

            if (ROOMS_ON_FLOOR_COUNTER < NUMBER_OF_ROOMS_PER_FLOOR) {

                HotelRoom hotelRoom = new HotelRoom();
                hotelFloor.addHotelRoom(hotelRoom);
                hotelRoom.book("Guest #" + i + " on floor #" + floorCounter);
                ROOMS_ON_FLOOR_COUNTER++;
            } else {
                ROOMS_ON_FLOOR_COUNTER = 0;
                hotelFloor = new HotelFloor();
                floorCounter++;
                HotelRoom hotelRoom = new HotelRoom();
                hotelFloor.addHotelRoom(hotelRoom);
                hotelRoom.book("Guest #" + i + " on floor #" + floorCounter);
                ROOMS_ON_FLOOR_COUNTER++;
            }
            hotel.addFloor(hotelFloor);

        }


    }


    // create hotel rooms
    // create hotel floors
    // add hotel rooms to hotel floors
    // take actions on rooms and floors and examine your output to ensure you implemented the desired
    // behaviors
}

