package attractions;

import interfaces.ITicketed;
import visitors.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private double defaultPrice;

    public Dodgems(String name) {
        super(name);
        this.defaultPrice = 4.50;
    }


    @Override
    public double defaultPrice() {
        return defaultPrice;
    }

    @Override
    public double priceForVisitor(Visitor visitor) {
        if (visitor.getAge() < 12){
            return defaultPrice()/2;
        }
        return defaultPrice;
    }
}
