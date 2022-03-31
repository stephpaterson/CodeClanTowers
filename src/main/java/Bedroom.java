import java.util.ArrayList;

public class Bedroom extends Room{

    private int roomNumber;
    private RoomType bedroomType;

    public Bedroom(ArrayList<String> guests, int roomNumber, RoomType bedroomType) {
        super(guests);
        this.roomNumber = roomNumber;
        this.bedroomType = bedroomType;
    }
}
