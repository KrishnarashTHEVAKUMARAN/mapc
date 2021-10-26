package td3.visitable;

import td3.visitor.Visitor;

public interface Visitable {
    void accept(Visitor visitor);
}
