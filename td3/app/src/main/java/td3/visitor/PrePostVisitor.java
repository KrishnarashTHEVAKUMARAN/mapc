package td3.visitor;

import td3.visitable.*;

public interface PrePostVisitor extends AbstractVisitor {
    void preVisit(GroupeClient groupeClient);
    void preVisit(Client client);
    void preVisit(Commande commande);
    void preVisit(Ligne ligne);
    void postVisit(GroupeClient groupeClient);
    void postVisit(Client client);
    void postVisit(Commande commande);
    void postVisit(Ligne ligne);
}
