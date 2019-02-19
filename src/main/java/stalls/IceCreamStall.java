package stalls;

import visitors.Visitor;

public class IceCreamStall extends Stall {

    private double defaultPrice;

    public IceCreamStall(String name, String ownerName, String parkingSpot) {
        super(name, ownerName, parkingSpot);
        this.defaultPrice = 2.80;
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
