package attractionsTest;

import attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    private Park park;

    @Before
    public void before(){
        park = new Park("Jurassic Park");
    }

    @Test
    public void getName(){
        assertEquals("Jurassic Park", park.getName());
    }

}
