import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    PlaneType planeType;
    Plane plane;

    @Before
    public void before(){
        plane = new Plane(planeType,300, 2500);
    }

    @Test
    public void typeOfPlane(){
        assertEquals(planeType, this.plane.getPlaneType());
    }

    @Test
    public void canHaveCapacity(){
        assertEquals(300, this.plane.getCapacity());
    }

    @Test
    public void canHaveTotalWeight(){
        assertEquals(2500, this.plane.getTotalWeight());
    }
}