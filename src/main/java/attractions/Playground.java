package attractions;

import interfaces.ISecurity;
import visitors.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name) {
        super(name);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() <= 13);
    }
}
