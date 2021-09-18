package td1.step4.api.burger;

public enum MenuSize {
    SMALL, MEDIUM, BIG;

    public double meatWeight() {
        double weight;
        switch (this) {
            case SMALL:
                weight = 50;
                break;
            case MEDIUM:
                weight = 100;
                break;
            case BIG:
            default:
                weight = 200;
        }
        return weight;
    }
}
