package td1.refactoring.api.burger;

public class Sauce implements Food {

    private static double BASE_PRICE = 1;

    private BurgerSauce type;
    private double weight;

    public Sauce(BurgerSauce type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public double price() {
        return BASE_PRICE;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double calories_per_100g() {
        return type.calories_per_100g();
    }

    @Override
    public String toString() {
        return String.format("%s sauce (%.0fg) -- %.2f€", type, weight(), price());
    }
}

