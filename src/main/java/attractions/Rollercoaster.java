package attractions;

import interfaces.ITicketed;
import visitors.Visitor;

public class Rollercoaster extends Attraction implements ITicketed {

    public Rollercoaster(String name) {
        super(name);
    }


    @Override
    public double defaultPrice() {
        return 1;
    }

    @Override
    public double priceForVisitor(Visitor visitor) {
        return 2;
    }
}
