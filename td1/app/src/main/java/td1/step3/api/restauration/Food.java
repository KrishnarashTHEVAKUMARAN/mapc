package td1.step3.api.restauration;

import td1.step3.api.dietetic.DieteticElement;
import td1.step3.api.monetary.Product;

public interface Food extends DieteticElement, Product {
    double weight();

    default double calories() {
        return weight() / 100 * calories_per_100g();
    }
}