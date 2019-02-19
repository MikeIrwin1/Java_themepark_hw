import org.junit.Before;
import org.junit.Test;
import visitors.Visitor;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    private Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(25, 180, 100);
    }

    @Test
    public void hasAge(){
        assertEquals(25, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(180, visitor.getHeight(), 0.01);
    }

    @Test
    public void hasMoney(){
        assertEquals(100, visitor.getMoney(), 0.01);
    }
}
