import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel codeClanTowers;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    ArrayList<Guest> guestList = new ArrayList<>();
    ArrayList<Guest> guestList2 = new ArrayList<>();
    ArrayList<Bedroom> bedroomList = new ArrayList<>();
    ArrayList<ConferenceRoom> conferenceRoomsList = new ArrayList<>();

    @Before
    public void before(){
        guest1 = new Guest("Rachel");
        guest2 = new Guest("Steph");
        guest3 = new Guest("Dio");
        guestList.add(guest1);
        guestList.add(guest2);
        guestList2.add(guest3);
        bedroom1 = new Bedroom(guestList, 1, RoomType.DOUBLE);
        bedroom2 = new Bedroom(guestList2, 2, RoomType.FAMILY);
        bedroomList.add(bedroom1);
        codeClanTowers = new Hotel(bedroomList, conferenceRoomsList);
    }

    @Test
    public void hasCollectionBedrooms(){
        assertEquals(bedroomList, codeClanTowers.getBedroomList());
    }


    @Test
    public void canAddBedroomToHotel(){
        int lengthBefore = bedroomList.size();
        codeClanTowers.addBedroom(guestList2, 2, RoomType.SINGLE);
        assertEquals(lengthBefore + 1, bedroomList.size());
    }

    @Test
    public void canCheckIn(){
        int countGuestsBefore = codeClanTowers.countGuestsInRoom(1);
        codeClanTowers.checkInGuest(1, guest3);
        assertEquals(countGuestsBefore + 1, codeClanTowers.countGuestsInRoom(1) );
    }
}
