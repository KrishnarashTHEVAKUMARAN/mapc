package td1.refactoring.api.burger;

public class Meat implements Food {

    private BurgerMeat type;
    private double weight;

    public Meat(BurgerMeat type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public double price() {
        return type.price() * weight / 100;
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
        return String.format("%s (%.0fg) -- %.2f€", type, weight(), price());
    }
}

