package td2.SystemeForum;

public class Salon extends ComposantImpl<Message>{

    public Salon(String sujet) {
        super(sujet);
    }

    @Override
    public void remove(int i) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Salon : "); stringBuilder.append(this.sujet);stringBuilder.append(" \n");
        for (Message content : contenu) {
            stringBuilder.append(String.format("- %s\n", content));
        }
        return stringBuilder.toString();
    }
}

