package td1.refactoring.api.burger;

public class Tomato implements Food {

    private static double BASE_PRICE = 0.5;
    private double weight;

    public Tomato(double weight) {
        this.weight = weight;
    }

    @Override
    public double calories_per_100g() {
        return 21;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double price() {
        return BASE_PRICE * weight / 100;
    }

    @Override
    public String toString() {
        return String.format("tomato, qty: %.0f -- %.2f", weight(), price());
    }
}
