package attractionsTest;

import attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    private Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("Destruction Derby");
    }

    @Test
    public void hasName(){
        assertEquals("Destruction Derby", dodgems.getName());
    }

}
