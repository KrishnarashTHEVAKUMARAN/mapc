package td3.visitable;

import td3.visitor.PrePostVisitor;
import td3.visitor.Visitor;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class GroupeClient implements PrePostVisitable, Visitable {
    private String name;
    private Map<String, Client> clients;

    public GroupeClient(String name) {
        this.name = name;
        this.clients = new HashMap<>();
    }

    public void addClient(Client client) {
        this.clients.put(client.getName(), client);
    }

    public Collection<Client> getClients() {
        return this.clients.values();
    }

    public void addCommande(String clientName, Commande commande) {
        Client client = this.clients.get(clientName);
        client.addCommande(commande);
    }

    public void addLigne(String clientName, String commandeName, Ligne ligne) {
        Client client = this.clients.get(clientName);
        client.addLigne(commandeName, ligne);
    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {
        prePostVisitor.preVisit(this);
        prePostVisitor.postVisit(this);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "GroupeClient{" + "name='" + this.name + '\'' + ", clients=" + this.clients + '}';
    }
}

