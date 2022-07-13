public class HotelManager {
    public static void main(String[] args) {
        Logger.getInstance().log("Managing hotel...");
        Hotel hotel = new Hotel();

        HotelFloor hotelFloor1 = new HotelFloor(001);
        HotelFloor hotelFloor2 = new HotelFloor(002);
        HotelFloor hotelFloor3 = new HotelFloor(003);
        hotelFloor1.addHotelRoom(new HotelRoom(101));
        hotelFloor1.addHotelRoom(new HotelRoom(102));
        hotelFloor1.addHotelRoom(new HotelRoom(103));
        hotelFloor1.addHotelRoom(new HotelRoom(104));
        hotelFloor1.addHotelRoom(new HotelRoom(105));
        hotelFloor2.addHotelRoom(new HotelRoom(201));
        hotelFloor2.addHotelRoom(new HotelRoom(202));
        hotelFloor2.addHotelRoom(new HotelRoom(203));
        hotelFloor2.addHotelRoom(new HotelRoom(204));
        hotelFloor2.addHotelRoom(new HotelRoom(205));
        hotelFloor3.addHotelRoom(new HotelRoom(301));
        hotelFloor3.addHotelRoom(new HotelRoom(302));
        hotelFloor3.addHotelRoom(new HotelRoom(303));
        hotelFloor3.addHotelRoom(new HotelRoom(304));
        hotelFloor3.addHotelRoom(new HotelRoom(305));

        hotel.addFloor(hotelFloor1);
        hotel.addFloor(hotelFloor2);
        hotel.addFloor(hotelFloor3);

        hotel.book("Terrence", 103);
        hotel.book("Larry", 101);
        hotel.book("Mike", 304);
        hotel.book("Joseph", 202);

    }


}


// create hotel rooms
// create hotel floors
// add hotel rooms to hotel floors
// take actions on rooms and floors and examine your output to ensure you implemented the desired
// behaviors


