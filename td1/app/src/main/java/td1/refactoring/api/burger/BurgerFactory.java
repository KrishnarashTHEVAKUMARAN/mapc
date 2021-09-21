package td1.refactoring.api.burger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BurgerFactory {

    private static BurgerFactory instance = null;

    private static Map<Price, List<BurgerRestaurant>> registry = new HashMap<>();

    private BurgerFactory() {
    }

    public static BurgerFactory instance() {
        if (instance == null) {
            instance = new BurgerFactory();
        }
        return instance;
    }

    public static void register(Price price, BurgerRestaurant restaurant) {
        if (!registry.containsKey(price)) {
            registry.put(price, new ArrayList<>());
        }
        registry.get(price).add(restaurant);
    }

    public BurgerRestaurant select(Price price) {
        return registry.get(price).get(0);
    }
}
