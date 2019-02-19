package attractionsTest;

import attractions.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    private Playground playground;

    @Before
    public void before(){
        playground = new Playground("Sandyland");
    }

    @Test
    public void hasName(){
        assertEquals("Sandyland", playground.getName());
    }



}
