package td1.refactoring.api.burger;

public interface Food extends DieteticElement, Product{
    default double calories() {
        return weight() / 100 * calories_per_100g();
    }
}
