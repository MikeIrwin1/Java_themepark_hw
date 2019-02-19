package stalls;

import visitors.Visitor;

public class CandyFlossStall extends Stall{

    private double defaultPrice;

    public CandyFlossStall(String name, String ownerName, String parkingSpot) {
        super(name, ownerName, parkingSpot);
        this.defaultPrice = 4.20;
    }

    @Override
    public double defaultPrice() {
        return defaultPrice;
    }

    @Override
    public double priceForVisitor(Visitor visitor) {
        return defaultPrice;
    }
}
