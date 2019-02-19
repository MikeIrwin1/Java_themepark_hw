package attractionsTest;

import attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;
import visitors.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    private Rollercoaster rollercoaster;
    private Visitor visitor;
    private Visitor visitor2;
    private Visitor visitor3;


    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Rise and Fall of Syntax Man");
        visitor = new Visitor(25, 110, 100);
        visitor2 = new Visitor(13, 210, 100);
    }

    @Test
    public void hasName(){
        assertEquals("Rise and Fall of Syntax Man", rollercoaster.getName());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(1, rollercoaster.defaultPrice(), 0.01);
    }

    @Test
    public void hasVisitorPrice(){
        assertEquals(2, rollercoaster.priceForVisitor(visitor), 0.01);
    }

    @Test
    public void visitorIsNotAllowed(){
        assertEquals(false, rollercoaster.isAllowedTo(visitor));
    }

    @Test
    public void visitorIsAllowed(){
        assertEquals(true, rollercoaster.isAllowedTo(visitor2));
    }

    @Test
    public void tallChargedDouble(){
        assertEquals(16.80, rollercoaster.priceForVisitor(visitor2), 0.01);
    }
}
