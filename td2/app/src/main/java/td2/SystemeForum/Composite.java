package td2.SystemeForum;

public interface Composite <C extends Composant>{
    void add(C contenu);
    void remove(int i);
    int size();
}
