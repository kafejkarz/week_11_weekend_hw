import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("John", CabinCrewMemberType.CAPTAIN);
    }

    @Test
    public void planeHaveAPilot(){
        assertEquals(CabinCrewMemberType.CAPTAIN, this.cabinCrewMember.getCabinCrewMemberType());
    }

    @Test
    public void CrewMemberHaveAName(){
        assertEquals("John", this.cabinCrewMember.getName());
    }

}
