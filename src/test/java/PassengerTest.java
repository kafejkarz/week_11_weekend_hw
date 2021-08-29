import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Arek", 2);
    }


    @Test
    public void passengerCanHaveBags(){
        assertEquals(2, this.passenger.getNumberOfBags());
    }
}
