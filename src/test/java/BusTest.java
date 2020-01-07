import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before

    public void before() {
        bus = new Bus ("Castle", 20);
        person = new Person();
        busStop = new BusStop("CodeClan");

    }

    @Test
    public void busShouldStartEmpty() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void busCanTakePassengers() {
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void busCanRemovePassengers() {
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canPickUpPassengersFromBusStop() {
        busStop.addPerson(person);
        bus.pickUpPassenger(busStop);
        assertEquals(0, busStop.personCount());
    }
}
