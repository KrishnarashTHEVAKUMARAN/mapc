package td2.SystemeFichier;

import java.util.Objects;

public class Owner {
    private final String name;

    public Owner(String n) {
        this.name = n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return name.equals(owner.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String toString(){
        return "Je suis" + this.name;
    }
}
