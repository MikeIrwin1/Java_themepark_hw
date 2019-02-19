package interfaces;

import visitors.Visitor;

public interface ISecurity {

    boolean isAllowedTo(Visitor visitor);

}
