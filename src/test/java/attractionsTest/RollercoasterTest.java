package attractionsTest;

import attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    private Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Rise and Fall of Syntax Man");
    }

    @Test
    public void hasName(){
        assertEquals("Rise and Fall of Syntax Man", rollercoaster.getName());
    }

}
