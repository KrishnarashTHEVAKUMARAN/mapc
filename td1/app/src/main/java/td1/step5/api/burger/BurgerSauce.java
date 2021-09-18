package td1.step5.api.burger;

import td1.step5.api.restauration.Base;

public enum BurgerSauce implements Base {
    BURGER, BARBECUE, BEARNAISE;

    @Override
    public double calories_per_100g() {
        double cal;
        switch (this) {
            case BURGER:
                cal = 240;
                break;
            case BARBECUE:
                cal = 130;
                break;
            case BEARNAISE:
            default:
                cal = 550;
                break;
        }
        return cal;
    }

    @Override
    public double price() {
        return 1;
    }

    public boolean hasUniquePrice() {
        return true;
    }

    @Override
    public String toString() {
        String type;
        switch (this) {
            case BURGER:
                type = "BURGER sauce";
                break;
            case BARBECUE:
                type = "BARBECUE sauce";
                break;
            case BEARNAISE:
            default:
                type = "BEARNAISE sauce";
                break;
        }
        return type;
    }
}
