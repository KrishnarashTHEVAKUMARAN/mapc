package td2.SystemeForum;

public class Message implements Composant{
    private String nom;
    private String description;

    public Message(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Message : " + this.nom + " \n"+ this.description + " \n";
    }
}
