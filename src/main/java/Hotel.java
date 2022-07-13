import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private final List<HotelFloor> hotelFloors;

    public Hotel() {
        this.hotelFloors = new ArrayList<HotelFloor>();
    }

    public void addFloor(HotelFloor hotelFloor) {
        hotelFloors.add(hotelFloor);
    }

}


