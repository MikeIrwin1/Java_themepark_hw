package attractionsTest;

import attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;
import visitors.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    private Dodgems dodgems;
    private Visitor visitor;

    @Before
    public void before(){
        dodgems = new Dodgems("Destruction Derby");
        visitor = new Visitor(25, 180, 100);
    }

    @Test
    public void hasName(){
        assertEquals("Destruction Derby", dodgems.getName());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(1, dodgems.defaultPrice(), 0.01);
    }

    @Test
    public void hasVisitorPrice(){
        assertEquals(2, dodgems.priceForVisitor(visitor), 0.01);
    }

}
