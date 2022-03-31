import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel codeClanTowers;
    Bedroom bedroom1;
    Guest guest1;
    Guest guest2;
    ArrayList<Guest> guestList = new ArrayList<>();
    ArrayList<Bedroom> bedroomList = new ArrayList<>();
    ArrayList<ConferenceRoom> conferenceRoomsList = new ArrayList<>();

    @Before
    public void before(){
        guest1 = new Guest("Rachel");
        guest2 = new Guest("Steph");
        guestList.add(guest1);
        guestList.add(guest2);
        bedroom1 = new Bedroom(guestList, 1, RoomType.DOUBLE);
        bedroomList.add(bedroom1);
        codeClanTowers = new Hotel(bedroomList, conferenceRoomsList);
    }

    @Test
    public void hasCollectionBedrooms(){
        assertEquals(bedroomList, codeClanTowers.getBedroomList());
    }

    @Test
    public void canCheckIn(){
        assertEquals();
    }
}
