package attractions;

import interfaces.ISecurity;
import interfaces.ITicketed;
import visitors.Visitor;

public class Rollercoaster extends Attraction implements ITicketed, ISecurity {

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

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() > 12 && visitor.getHeight() > 145){
            return true;
        }
        return false;
    }
}
