package td1.step5.api.burger;

import td1.step5.api.restauration.ComposedFood;

public class BurgerBuilder {

    private ComposedFood burger;

    private BurgerBuilder() {
    }

    public static BurgerBuilder order_menu(String name, MenuType type) {
        BurgerBuilder rtr;
        switch (type) {
            case MEAT_MENU:
                rtr = order_personal(name, BurgerMeat.BEEF, MenuSize.MEDIUM).with_sauce(BurgerSauce.BURGER)
                        .with_onions().with_cheese();
                break;
            case FISH_MENU:
                rtr = order_personal(name, BurgerMeat.WHITEFISH, MenuSize.SMALL).with_sauce(BurgerSauce.BEARNAISE);
                break;
            case CHEESE_MENU:
            default:
                rtr = order_personal(name, BurgerMeat.BEEF, MenuSize.SMALL).with_cheese();
                break;
        }
        return rtr;
    }

    public static BurgerBuilder order_personal(String name, BurgerMeat meat, MenuSize size) {
        BurgerBuilder rtr = new BurgerBuilder();
        rtr.burger = new Burger(name);
        rtr.burger.add(meat, size.meatWeight());
        return rtr;
    }

    public BurgerBuilder with_onions() {
        this.burger.add(BurgerIngredient.DEEPFRIEDONIONS, 10);
        return this;
    }

    public BurgerBuilder with_tomato() {
        this.burger.add(BurgerIngredient.TOMATO, 10);
        return this;
    }

    public BurgerBuilder with_cheese() {
        this.burger.add(BurgerIngredient.CHEDDAR, 15);
        return this;
    }

    public BurgerBuilder with_sauce(BurgerSauce sauce) {
        this.burger.add(sauce, 40);
        return this;
    }

    public ComposedFood cook() {
        return this.burger;
    }
}
