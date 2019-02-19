package attractionsTest;

import attractions.Playground;
import org.junit.Before;
import org.junit.Test;
import visitors.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    private Playground playground;
    private Visitor visitor;
    private Visitor visitor2;

    @Before
    public void before(){
        playground = new Playground("Sandyland");
        visitor = new Visitor(25, 180, 100);
        visitor2 = new Visitor(10, 180, 100);
    }

    @Test
    public void hasName(){
        assertEquals("Sandyland", playground.getName());
    }

    @Test
    public void visitorIsNotAllowedTo(){
        assertEquals(false, playground.isAllowedTo(visitor));
    }

    @Test
    public void visitIsAllowedTo(){
        assertEquals(true, playground.isAllowedTo(visitor2));
    }

}
