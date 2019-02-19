package attractions;

import interfaces.ISecurity;
import interfaces.ITicketed;
import visitors.Visitor;

public class Rollercoaster extends Attraction implements ITicketed, ISecurity {

    private double defaultPrice;

    public Rollercoaster(String name) {
        super(name);
        this.defaultPrice = 8.40;
    }


    @Override
    public double defaultPrice() {
        return defaultPrice;
    }

    @Override
    public double priceForVisitor(Visitor visitor) {
        if (visitor.getHeight() > 200){
            return defaultPrice * 2;
        }
        return defaultPrice;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() > 12 && visitor.getHeight() > 145){
            return true;
        }
        return false;
    }
}
