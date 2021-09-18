package td1.step5.api.burger;

import td1.step5.api.restauration.Base;

public enum BurgerIngredient implements Base {
    CHEDDAR, DEEPFRIEDONIONS, TOMATO;

    @Override
    public double calories_per_100g() {
        double rtr;
        switch (this) {
            case CHEDDAR:
                rtr = 400;
                break;
            case DEEPFRIEDONIONS:
                rtr = 590;
                break;
            case TOMATO:
            default:
                rtr = 21;
        }
        return rtr;
    }

    @Override
    public double price() {
        double rtr;
        switch (this) {
            case CHEDDAR:
                rtr = 4;
                break;
            case DEEPFRIEDONIONS:
                rtr = 1.5;
                break;
            case TOMATO:
            default:
                rtr = 0.5;
        }
        return rtr;
    }

    public boolean hasUniquePrice() {
        return false;
    }

    @Override
    public String toString() {
        String rtr;
        switch (this) {
            case CHEDDAR:
                rtr = "cheddar";
                break;
            case DEEPFRIEDONIONS:
                rtr = "deep fried onions";
                break;
            case TOMATO:
            default:
                rtr = "tomato";
        }
        return rtr;
    }
}
