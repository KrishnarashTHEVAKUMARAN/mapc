package td3.visitor;

import td3.visitable.Client;
import td3.visitable.Commande;
import td3.visitable.GroupeClient;
import td3.visitable.Ligne;

import java.util.HashMap;
import java.util.Map;

public class AfficheCommande implements Visitor {

    private Map<String, Integer> stringIntegerMap;
    private int iteration;

    public AfficheCommande() {
        this.stringIntegerMap = new HashMap<>();
        this.iteration = 0;
    }

    @Override
    public void visit(GroupeClient groupeClient) {
        for (Client client : groupeClient.getClients()) {
            client.accept(this);
            System.out.println(String.format("Le client %s doit %d", client.getName(), stringIntegerMap.get(client.getName())));
        }
    }

    @Override
    public void visit(Client client) {
        iteration = 0;
        for (Commande commande : client.getCommandes()){
            commande.accept(this);
        }
        stringIntegerMap.put(client.getName(), iteration);
    }

    @Override
    public void visit(Commande commande) {
        for (Ligne ligne : commande.getLignes()){
            ligne.accept(this);
        }
    }

    @Override
    public void visit(Ligne ligne) {
        iteration += ligne.getSum();
    }
}
