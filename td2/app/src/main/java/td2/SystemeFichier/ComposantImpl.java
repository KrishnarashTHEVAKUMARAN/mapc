package td2.SystemeFichier;

import java.util.ArrayList;
import java.util.List;

public class ComposantImpl implements Composant {
    protected final String name;
    protected Owner owner;
    protected final List<String> content;


    protected ComposantImpl(String name, Owner owner) {
        this.name = name;
        this.owner = new Owner("");;
        this.content = new ArrayList<>();
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getContent() {
        StringBuilder stringBuilder = new StringBuilder();
        this.content.forEach(content -> stringBuilder.append(content).append(",\n"));
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
}
