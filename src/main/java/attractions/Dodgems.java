package attractions;

import interfaces.ITicketed;
import visitors.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name) {
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
