package td1.step4.api.restauration;

import td1.step4.api.dietetic.DieteticElement;
import td1.step4.api.monetary.Product;

public interface Base extends DieteticElement, Product {
    boolean hasUniquePrice();
}
