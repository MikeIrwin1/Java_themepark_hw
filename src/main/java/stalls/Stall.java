package stalls;

import interfaces.IReviewed;

public abstract class Stall implements IReviewed {

    private String name;
    private String ownerName;
    private String parkingSpot;
    private int rating;

    public Stall(String name, String ownerName, String parkingSpot){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getParkingSpot() {
        return parkingSpot;
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
