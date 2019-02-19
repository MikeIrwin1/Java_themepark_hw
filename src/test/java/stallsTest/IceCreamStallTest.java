package stallsTest;

import org.junit.Before;
import org.junit.Test;
import stalls.IceCreamStall;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    private IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Brain Freeze", "Mr Freeze", "Freezer");
    }

    @Test
    public void hasName(){
        assertEquals("Brain Freeze", iceCreamStall.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Mr Freeze", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals("Freezer", iceCreamStall.getParkingSpot());
    }
}
