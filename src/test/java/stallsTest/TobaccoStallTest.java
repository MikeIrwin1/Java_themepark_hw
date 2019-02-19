package stallsTest;

import org.junit.Before;
import org.junit.Test;
import stalls.TobaccoStall;
import visitors.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    private TobaccoStall tobaccoStall;
    private Visitor visitor;
    private Visitor visitor2;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Iron Lung", "Mr Tar", "Smokehouse");
        visitor = new Visitor(10, 180, 100);
        visitor2 = new Visitor(19, 180, 100);
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

    @Test
    public void visitorIsNotAllowed(){
        assertEquals(false, tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void visitorIsAllowed(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitor2));
    }
}