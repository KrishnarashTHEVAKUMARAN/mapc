package td1.refactoring.api.burger;

public class Cheddar implements Food {

    private static double BASE_PRICE = 4;
    private double weight;

    public Cheddar(double weight) {
        this.weight = weight;
    }

    @Override
    public double calories_per_100g() {
        return 400;
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
        return String.format("cheddar (%.0fg) -- %.2f€", weight(), price());
    }
}
