package td3.visitor;

import td3.visitable.Client;
import td3.visitable.Commande;
import td3.visitable.GroupeClient;
import td3.visitable.Ligne;

public class XMLRapportCommandes implements PrePostVisitor {

    @Override
    public void preVisit(GroupeClient groupeClient) {
        System.out.println("<groupe>");
        for (Client client : groupeClient.getClients()){
            client.accept(this);
        }
    }

    @Override
    public void preVisit(Client client) {
        System.out.println("<client name=\"" + client.getName() + "\">");
        for (Commande commande : client.getCommandes()){
            commande.accept(this);
        }
    }

    @Override
    public void preVisit(Commande commande) {
        System.out.println("<commande name=\"" + commande.getName() + "\">");
        for (Ligne ligne : commande.getLignes()){
            ligne.accept(this);
        }
    }

    @Override
    public void preVisit(Ligne ligne) {
        System.out.println("<ligne name=\"" + ligne.getName() + "\" sum=\"" + ligne.getSum() + "\"/>");
    }

    @Override
    public void postVisit(Client client) {
        System.out.println("</client>");
    }

    @Override
    public void postVisit(Commande commande) {
        System.out.println("</commande>");
    }

    @Override
    public void postVisit(Ligne ligne) {
    }

    @Override
    public void postVisit(GroupeClient groupeClient) {
        System.out.println("</groupe>");
    }
}

