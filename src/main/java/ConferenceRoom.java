import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private String name;
    private int capacity;

    public ConferenceRoom(ArrayList<Guest> guests, String name, int capacity) {
        super(guests);
        this.name = name;
        this.capacity = capacity;
    }
}
