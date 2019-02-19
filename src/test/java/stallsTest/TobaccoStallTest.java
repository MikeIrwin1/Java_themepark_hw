package stallsTest;

import org.junit.Before;
import org.junit.Test;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    private TobaccoStall tobaccoStall;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Iron Lung", "Mr Tar", "Smokehouse");
    }

    @Test
    public void hasName(){
        assertEquals("Iron Lung", tobaccoStall.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Mr Tar", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals("Smokehouse", tobaccoStall.getParkingSpot());
    }
}