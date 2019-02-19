package attractionsTest;

import attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;
import visitors.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    private Rollercoaster rollercoaster;
    private Visitor visitor;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Rise and Fall of Syntax Man");
        visitor = new Visitor(25, 180, 100);

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

}
