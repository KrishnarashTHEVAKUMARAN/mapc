package td1.step3.api.restauration;

import td1.step3.api.dietetic.DieteticElement;
import td1.step3.api.monetary.Product;

public interface Base extends DieteticElement, Product {
    boolean hasUniquePrice();
}
