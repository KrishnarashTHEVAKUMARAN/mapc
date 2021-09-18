package td1.step5.api.restauration;

import td1.step5.api.dietetic.DieteticElement;
import td1.step5.api.monetary.Product;

public interface Base extends DieteticElement, Product {
    boolean hasUniquePrice();
}
