package td2.SystemeForum;

public class Forum extends ComposantImpl<Theme>  {

    public Forum(String sujet) {
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
        StringBuilder sb = new StringBuilder();
        sb.append("Forum : "); sb.append(this.sujet);sb.append(" \n");
        for (Theme child : contenu) {
            sb.append(String.format("- %s\n", child));
        }
        return sb.toString();
    }


}
