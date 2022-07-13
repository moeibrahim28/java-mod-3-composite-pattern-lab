class HotelRoom implements HotelRoomInterface {
    private int roomNumber;

    public HotelRoom(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void book(String guestName, int roomNumber) {
        Logger.getInstance().log("Booked room#"+roomNumber+" for " + guestName);
    }

    public void clean() {
        Logger.getInstance().log("Cleaned room");
    }


}