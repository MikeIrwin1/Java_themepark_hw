package interfaces;

import visitors.Visitor;

public interface ITicketed {

    double defaultPrice();
    double priceForVisitor(Visitor visitor);
}
