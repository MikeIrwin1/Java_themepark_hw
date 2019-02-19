package stallsTest;

import org.junit.Before;
import org.junit.Test;
import stalls.CandyFlossStall;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    private CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("It's So Fluffy", "Jasmine", "River Island");
    }

    @Test
    public void hasName(){
        assertEquals("It's So Fluffy", candyFlossStall.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Jasmine", candyFlossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals("River Island", candyFlossStall.getParkingSpot());
    }
}