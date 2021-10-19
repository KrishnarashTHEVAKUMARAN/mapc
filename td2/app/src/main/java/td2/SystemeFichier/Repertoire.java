package td2.SystemeFichier;

import java.util.List;

public class Repertoire extends ComposantImpl implements Composant, Composite<Composant>{
    protected Repertoire(String name, Owner owner) {
        super(name, owner);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getContent() {
        StringBuilder stringBuilder = new StringBuilder("File content:\n");
        stringBuilder.append(super.getContent());
        return stringBuilder.toString();
    }

    @Override
    public Owner getOwner() {
        return this.owner;
    }

    @Override
    public int getSize() {
        return this.content.size();
    }

    @Override
    public void appendContent(String s) {

    }

    @Override
    public Owner setOwner(Owner o) {
        return this.owner = o;
    }

    @Override
    public void addChild(Composant composant) {

    }

    @Override
    public void removeChild(Composant composant) {

    }

    @Override
    public void getChildren(List<Composant> composantList) {

    }

    @Override
    public void removeChildren(List<Composant> composantList) {

    }
}
