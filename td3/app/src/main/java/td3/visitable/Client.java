package td3.visitable;

import td3.visitor.PrePostVisitor;
import td3.visitor.Visitor;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Client implements Visitable, PrePostVisitable {

    private String name;
    private Map<String,Commande> commandes;

    public Client(String name) {
        this.name = name;
        this.commandes = new HashMap<>();
    }

    void addCommande(Commande commande){
        this.commandes.put(commande.getName(), commande);
    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {
        prePostVisitor.preVisit(this);
        for(Commande co:commandes.values()){
            co.accept(prePostVisitor);
            prePostVisitor.postVisit(this);
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for(Commande commande : commandes.values()){
            commande.accept(visitor);
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Client client = (Client) obj;
        return Objects.equals(this.name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

    public void addLigne(String nomCommande, Ligne ligne) {
        this.commandes.get(nomCommande).addLigne(ligne);
    }

    public Collection<Commande> getCommandes() {
        return this.commandes.values();
    }

    @Override
    public String toString() {
        return "Client{" + "name='" + this.name + '\'' + '}';
    }
}
