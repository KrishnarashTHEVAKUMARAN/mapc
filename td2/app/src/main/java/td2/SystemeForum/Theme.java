package td2.SystemeForum;

public class Theme extends ComposantImpl<Salon> {

    public Theme(String sujet) {
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
        stringBuilder.append("Theme : "); stringBuilder.append(this.sujet);stringBuilder.append(" \n");
        for (Salon child : contenu) {
            stringBuilder.append(String.format("- %s\n", child));
        }
        return stringBuilder.toString();
    }
}
