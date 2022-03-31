import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms){
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;

    }

    public ArrayList<Bedroom> getBedroomList() {
        return this.bedrooms;
    }

    public void addBedroom(ArrayList<Guest> guestList, int roomNumber, RoomType roomType) {
        Bedroom bedroom = new Bedroom( guestList, roomNumber, roomType);
        bedrooms.add(bedroom);
    }

    public int countGuestsInRoom(int roomNumber){
        for ( Bedroom bedroom : bedrooms ) {
            if (roomNumber == bedroom.getRoomNumber()) {
                return bedroom.countGuests();
            }
        }
        return 0;
    }

    public void checkInGuest(int roomNumber, Guest guest){
        for ( Bedroom bedroom : bedrooms ) {
            if (roomNumber == bedroom.getRoomNumber()) {
                bedroom.addGuest(guest);
            }
        }
    }
}
