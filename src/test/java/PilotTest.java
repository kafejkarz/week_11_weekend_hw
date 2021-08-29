import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Olivia", CabinCrewMemberType.CAPTAIN, "12345");
    }

    @Test
    public void planeHaveAPilot(){
        assertEquals(CabinCrewMemberType.CAPTAIN, this.pilot.getCabinCrewMemberType());
    }

    @Test
    public void pilotHaveName(){
        assertEquals("Olivia", this.pilot.getName());
    }

    @Test
    public void pilotHaveLicenceNumber(){
        assertEquals("12345", this.pilot.getLicenceNumber());
    }
}
