import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Guest> guests;

    public Room(ArrayList<Guest> guests){
        this.guests = guests;
    }


}
