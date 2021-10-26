package td3.visitable;

import td3.visitor.PrePostVisitor;
import td3.visitor.Visitor;

import java.util.Collection;
import java.util.HashMap;

public class Commande implements PrePostVisitable, Visitable {
    private  String name;
    private final HashMap<String, Ligne> lignes;

    public Commande(String name) {
        this.name = name;
        this.lignes = new HashMap<>();
    }

    void addLigne(Ligne ligne){
        this.lignes.put(ligne.getName(),ligne);
    }

    public Collection<Ligne> getLignes() {
        return this.lignes.values();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {
        prePostVisitor.preVisit(this);
        for(Ligne ligne: this.lignes.values()){
            ligne.accept(prePostVisitor);
            prePostVisitor.postVisit(this);
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Commande{" + "name='" + this.name + '\'' + '}';
    }
}
