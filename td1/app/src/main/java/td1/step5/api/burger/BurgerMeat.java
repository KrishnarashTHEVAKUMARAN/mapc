package td1.step5.api.burger;

import td1.step5.api.restauration.Base;

public enum BurgerMeat implements Base {
    BEEF, WHITEFISH;

    @Override
    public double calories_per_100g() {
        double cal;
        switch (this) {
            case BEEF:
                cal = 200;
                break;
            case WHITEFISH:
            default:
                cal = 170;
                break;
        }
        return cal;
    }

    @Override
    public double price() {
        double price;
        switch (this) {
            case BEEF:
                price = 4;
                break;
            case WHITEFISH:
            default:
                price = 6;
                break;
        }
        return price;
    }

    public boolean hasUniquePrice() {
        return false;
    }

    @Override
    public String toString() {
        String type;
        switch (this) {
            case BEEF:
                type = "BEEF";
                break;
            case WHITEFISH:
            default:
                type = "WHITEFISH";
                break;
        }
        return type;
    }
}
