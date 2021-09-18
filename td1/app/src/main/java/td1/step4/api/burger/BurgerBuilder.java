package td1.step4.api.burger;

import td1.step4.api.restauration.ComposedFood;

public class BurgerBuilder {

    private ComposedFood burger;

    private BurgerBuilder() {
    }

    public static BurgerBuilder order_menu(String name, MenuType type) {
        BurgerBuilder burgerBuilder;
        switch (type) {
            case MEAT_MENU:
                burgerBuilder = order_beef(name, MenuSize.MEDIUM).with_burger_sauce().with_onions().with_cheese();
                break;
            case FISH_MENU:
                burgerBuilder = order_fish(name, MenuSize.SMALL).with_bearnaise_sauce();
                break;
            case CHEESE_MENU:
            default:
                burgerBuilder = order_beef(name, MenuSize.SMALL).with_cheese();
                break;
        }
        return burgerBuilder;
    }

    public static BurgerBuilder order_beef(String name, MenuSize size) {
        BurgerBuilder burgerBuilder = new BurgerBuilder();
        burgerBuilder.burger = new Burger(name);
        burgerBuilder.burger.add(BurgerBase.BEEF, size.meatWeight());
        return burgerBuilder;
    }

    public static BurgerBuilder order_fish(String name, MenuSize size) {
        BurgerBuilder burgerBuilder = new BurgerBuilder();
        burgerBuilder.burger = new Burger(name);
        burgerBuilder.burger.add(BurgerBase.WHITEFISH, size.meatWeight());
        return burgerBuilder;
    }

    public BurgerBuilder with_onions() {
        this.burger.add(BurgerBase.DEEPFRIEDONIONS, 10);
        return this;
    }

    public BurgerBuilder with_tomato() {
        this.burger.add(BurgerBase.TOMATO, 10);
        return this;
    }

    public BurgerBuilder with_cheese() {
        this.burger.add(BurgerBase.CHEDDAR, 15);
        return this;
    }

    public BurgerBuilder with_bearnaise_sauce() {
        this.burger.add(BurgerBase.BEARNAISE, 40);
        return this;
    }

    public BurgerBuilder with_burger_sauce() {
        this.burger.add(BurgerBase.BURGER, 40);
        return this;
    }

    public BurgerBuilder with_barbecue_sauce() {
        this.burger.add(BurgerBase.BARBECUE, 40);
        return this;
    }

    public ComposedFood cook() {
        return this.burger;
    }
}
