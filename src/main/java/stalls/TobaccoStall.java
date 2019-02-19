package stalls;

import interfaces.ISecurity;
import visitors.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    private double defaultPrice;

    public TobaccoStall(String name, String ownerName, String parkingSpot) {
        super(name, ownerName, parkingSpot);
        this.defaultPrice = 6.60;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() > 18);
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
