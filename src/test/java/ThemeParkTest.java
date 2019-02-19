import attractions.Attraction;
import attractions.Dodgems;
import attractions.Playground;
import attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;
import stalls.CandyFlossStall;
import stalls.IceCreamStall;
import stalls.Stall;
import visitors.Visitor;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private Rollercoaster rollercoaster;
    private Dodgems dodgems;
    private Visitor visitor;
    private Playground playground;
    private ArrayList<Attraction> attractions;
    private CandyFlossStall candyFlossStall;
    private ArrayList<Stall> stalls;
    private IceCreamStall iceCreamStall;

    private ThemePark themePark;

    @Before
    public void before() {
        attractions = new ArrayList<>();

        rollercoaster = new Rollercoaster("Rise and Fall of Syntax Man");
        dodgems = new Dodgems("Destruction Derby");
        attractions.add(rollercoaster);
        attractions.add(dodgems);

        stalls = new ArrayList<>();
        candyFlossStall = new CandyFlossStall("It's So Fluffy", "Jasmine", "River Island");
        iceCreamStall = new IceCreamStall("Brain Freeze", "Mr Freeze", "Freezer");
        stalls.add(iceCreamStall);
        stalls.add(candyFlossStall);

        visitor = new Visitor(16, 130, 100);

        themePark = new ThemePark("Bulldog", attractions, stalls);
    }

    @Test
    public void hasName(){
        assertEquals("Bulldog", themePark.getName());
    }

    @Test
    public void hasAttractions(){
        assertEquals(attractions, themePark.getAttractions());
    }

    @Test
    public void hasStalls(){
        assertEquals(stalls, themePark.getStalls());
    }

    @Test
    public void hasReviewed(){
        assertEquals(0, themePark.getReviewed().size());
    }

    @Test
    public void attractionsAllowedForVisitor(){
        assertEquals(3, themePark.allAllowed(visitor));
    }


}
