import attractions.Attraction;
import interfaces.IReviewed;
import interfaces.ISecurity;
import stalls.Stall;
import visitors.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviewed;

    public ThemePark(String name, ArrayList<Attraction> attractions, ArrayList<Stall> stalls){
        this.name = name;
        this.attractions = attractions;
        this.stalls = stalls;
        this.reviewed = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public ArrayList<IReviewed> getReviewed() {
        return reviewed;
    }

    public int allAllowed(Visitor visitor) {
        ArrayList<IReviewed> allowed = new ArrayList<>();

        for (Attraction attraction : attractions){
            if (!(attraction instanceof ISecurity) || ((ISecurity) attraction).isAllowedTo(visitor)) {
                allowed.add(attraction);
            }
        }
        for (Stall stall : stalls){
            if(!(stall instanceof ISecurity) || ((ISecurity) stall).isAllowedTo(visitor)){
                allowed.add(stall);
            }

        }

        return allowed.size();
    }
}
