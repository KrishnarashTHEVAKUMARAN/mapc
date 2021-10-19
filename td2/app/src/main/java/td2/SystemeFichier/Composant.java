package td2.SystemeFichier;

public interface Composant {
    String getName();
    String getContent();
    Owner getOwner();
    int getSize();
    void appendContent(String s);
    Owner setOwner(Owner o);
}
