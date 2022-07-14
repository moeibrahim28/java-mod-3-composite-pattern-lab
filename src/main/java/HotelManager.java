import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HotelManager {
    public static void main(String[] args) {
        Logger.getInstance().log("Managing hotel...");
        int NUMBER_OF_FLOORS = 3;
        int NUMBER_OF_ROOMS = 5;
        int floorNumber = 1;
        // create hotel rooms
        List<HotelRoom> hotelRooms = new ArrayList<HotelRoom>();
        List<HotelFloor> hotelFloors = new ArrayList<>();

        // create hotel floors
        for (int i = 0; i < (NUMBER_OF_FLOORS * NUMBER_OF_ROOMS); i++) {
            if (i % NUMBER_OF_FLOORS == 0 && i != 0)
                floorNumber++;
            HotelRoom hotelRoom = new HotelRoom((floorNumber * 20) + (i % NUMBER_OF_ROOMS) + i);
            hotelRooms.add(hotelRoom);
            hotelFloors.get(floorNumber - 1).addHotelRoom(hotelRoom);
        }

        RoomCheckinObserver emailService = new HotelEmailService();
        RoomCheckinObserver notificationService = new HotelPushNotificationService();
        for (HotelRoom hotelRoom : hotelRooms) {
            hotelRoom.addCheckinObserver(emailService);
            hotelRoom.addCheckinObserver(notificationService);
        }

        final String[] guests = {"Mike", "Moe", "Larry", "Gene"};
        Random random = new Random();
        for (String guest : guests) {
            int randomRoom= random.nextInt(hotelRooms.size());
            HotelRoom hotelRoomBooked=hotelRooms.get(randomRoom);
            hotelRoomBooked.book(guest, randomRoom);
            hotelRoomBooked.checkIn(guest);

        }

    }
}




// create hotel rooms
// create hotel floors
// add hotel rooms to hotel floors
// take actions on rooms and floors and examine your output to ensure you implemented the desired
// behaviors


