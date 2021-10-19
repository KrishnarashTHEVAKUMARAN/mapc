package td2.SystemeForum;

import java.util.ArrayList;
import java.util.List;

public abstract class ComposantImpl <C extends Composant> implements Composite<C> , Composant{
    final List<C> contenu;
    String sujet;

    public ComposantImpl(String sujet) {
        this.sujet = sujet;
        this.contenu = new ArrayList<>();
    }

    public void add(C content){
        this.contenu.add(content);
    }

    @Override
    public String toString() {
        return "Content{" + "contenu=" + contenu + ", sujet='" + sujet + '\'' + '}';
    }
}
