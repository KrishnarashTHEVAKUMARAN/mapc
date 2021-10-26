package td3.visitor;

import td3.visitable.Client;
import td3.visitable.Commande;
import td3.visitable.GroupeClient;
import td3.visitable.Ligne;

public interface Visitor extends AbstractVisitor {
    void visit(GroupeClient groupeClient);
    void visit(Client client);
    void visit(Commande commande);
    void visit(Ligne ligne);
}
