package attractions;

import interfaces.IReviewed;

public abstract class Attraction implements IReviewed {

    private String name;
    private int rating;

    public Attraction(String name){
        this.name = name;
        this.rating = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRating(){
        return rating;
    }

    @Override
    public void setRating(int rating){
        this.rating = rating;
    }

}
