package td3;

import td3.visitable.Client;
import td3.visitable.Commande;
import td3.visitable.GroupeClient;
import td3.visitable.Ligne;
import td3.visitor.Visitor;

public class AffichageQuestion3 implements Visitor {

    @Override
    public void visit(GroupeClient groupeClient) {
        System.out.println(String.format("je visite un GroupeClient %s ", groupeClient.getName()));
    }

    @Override
    public void visit(Client client) {
        System.out.println(String.format("je visite un Client %s ", client.getName()));
    }

    @Override
    public void visit(Commande commande) {
        System.out.println(String.format("je visite une Commande %s ", commande.toString()));
    }

    @Override
    public void visit(Ligne ligne) {
        System.out.println(String.format("je visite une Ligne %s ", ligne.toString()));
    }
}
