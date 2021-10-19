package td2.SystemeFichier;

public class FSFactory {
    private final static FSFactory instance = new FSFactory();

    public Composant createComposant(ComposantType type, String name, Owner owner) {
        Composant composant = null;
        switch(type){
            case FICHIER -> composant = new Fichier(name, owner);
            case REPERTOIRE -> composant = new Repertoire(name, owner);
            default -> throw new IllegalStateException("Unexpected value: " + type);
        } return composant;
    }

    public static FSFactory getInstance() {
        return instance;
    }

}
