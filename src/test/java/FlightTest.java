import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    CabinCrewMember cabinCrewMember;
    Passenger passenger;
    Plane plane;


    @Before
    public void before(){
        flight = new Flight("123", "Edinburgh", "Krakow", "23.50");
        pilot = new Pilot("Olivia", CabinCrewMemberType.CAPTAIN, "12345");
        cabinCrewMember = new CabinCrewMember("Jessica", CabinCrewMemberType.FLIGHT_ATTENDANT);
        passenger = new Passenger("Arek", 2);
        plane = new Plane(PlaneType.BOEING747,300, 2500);
    }

    @Test
    public void canHaveDestinationAirport(){
        assertEquals("Edinburgh", this.flight.getDestination() );
    }

    @Test
    public void flightHaveAPilot(){
        assertEquals(CabinCrewMemberType.CAPTAIN, this.pilot.getCabinCrewMemberType());
    }

    @Test
    public void flightHaveAFlightAttendant(){
        assertEquals(CabinCrewMemberType.FLIGHT_ATTENDANT, this.cabinCrewMember.getCabinCrewMemberType());
    }

    @Test
    public void passengerHaveName(){
        assertEquals("Arek", this.passenger.getName());
    }

    @Test
    public void typeOfPlane(){
        assertEquals(PlaneType.BOEING747, this.plane.getPlaneType());
    }
}
