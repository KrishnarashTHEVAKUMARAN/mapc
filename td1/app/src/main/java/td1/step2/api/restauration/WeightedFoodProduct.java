package td1.step2.api.restauration;

public interface WeightedFoodProduct extends FoodProduct {
    double weight();

    default double calories() {
        return weight() / 100 * calories_per_100g();
    }
}
