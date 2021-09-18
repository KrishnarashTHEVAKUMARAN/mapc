package td1.step4.api.restauration;

public class Ingredient implements Food {
    private Base base;
    private double weight;

    public Ingredient(Base base, double weight) {
        this.base = base;
        this.weight = weight;
    }

    @Override
    public double calories_per_100g() {
        return base.calories_per_100g();
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double price() {
        return base.hasUniquePrice() ? base.price() : weight / 100 * base.price();
    }

    @Override
    public String toString() {
        return String.format("%s (%.0fg) -- %.2f€", this.base, weight(), price());
    }

}
