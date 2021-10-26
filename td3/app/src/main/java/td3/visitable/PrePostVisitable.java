package td3.visitable;

import td3.visitor.AbstractVisitor;
import td3.visitor.PrePostVisitor;

public interface PrePostVisitable extends AbstractVisitor {
    void accept(PrePostVisitor prePostVisitor);
}
