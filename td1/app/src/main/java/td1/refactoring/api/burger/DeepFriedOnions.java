package td1.refactoring.api.burger;

public class DeepFriedOnions implements Food {

    private static double BASE_PRICE = 1.5;
    private double weight;

    public DeepFriedOnions(double weight) {
        this.weight = weight;
    }

    @Override
    public double calories_per_100g() {
        return 590;
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
        return String.format("deep fried onions (%.0fg) -- %.2f€", weight(), price());
    }

}
