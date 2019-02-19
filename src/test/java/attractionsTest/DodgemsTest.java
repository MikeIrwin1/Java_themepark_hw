package attractionsTest;

import attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;
import visitors.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    private Dodgems dodgems;
    private Visitor visitor;
    private Visitor visitor2;

    @Before
    public void before(){
        dodgems = new Dodgems("Destruction Derby");
        visitor = new Visitor(25, 180, 100);
        visitor2 = new Visitor(10, 150, 100);
    }

    @Test
    public void hasName(){
        assertEquals("Destruction Derby", dodgems.getName());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(4.50, dodgems.defaultPrice(), 0.01);
    }

    @Test
    public void hasVisitorPrice(){
        assertEquals(4.50, dodgems.priceForVisitor(visitor), 0.01);
    }

    @Test
    public void hasRating(){
        assertEquals(0, dodgems.getRating());
    }

    @Test
    public void childPrice(){
        assertEquals(2.25, dodgems.priceForVisitor(visitor2), 0.01);
    }

}
