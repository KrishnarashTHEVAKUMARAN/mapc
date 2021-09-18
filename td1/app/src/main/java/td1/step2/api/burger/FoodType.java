package td1.step2.api.burger;

import td1.step2.api.restauration.FoodProduct;

public enum FoodType implements FoodProduct {
    BURGER, BARBECUE, BEARNAISE, BEEF, WHITEFISH, CHEDDAR, DEEPFRIEDONIONS, TOMATO;

    @Override
    public double calories_per_100g() {
        double rtr;
        switch (this) {
            case BURGER:
                rtr = 240;
                break;
            case BARBECUE:
                rtr = 130;
                break;
            case BEARNAISE:
                rtr = 550;
                break;
            case BEEF:
                rtr = 200;
                break;
            case WHITEFISH:
                rtr = 170;
                break;
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
        double price;
        switch (this) {
            case BURGER:
            case BARBECUE:
            case BEARNAISE:
                price = 1;
                break;
            case BEEF:
                price = 4;
                break;
            case WHITEFISH:
                price = 6;
                break;
            case CHEDDAR:
                price = 4;
                break;
            case DEEPFRIEDONIONS:
                price = 1.5;
                break;
            case TOMATO:
            default:
                price = 0.5;
        }
        return price;
    }

    public boolean hasUniquePrice() {
        boolean UniquePrice;
        switch (this) {
            case BURGER:
            case BARBECUE:
            case BEARNAISE:
                UniquePrice = true;
                break;
            default:
                UniquePrice = false;
        }
        return UniquePrice;
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
                type = "BEARNAISE sauce";
                break;
            case BEEF:
                type = "BEEF";
                break;
            case WHITEFISH:
                type = "WHITEFISH";
                break;
            case CHEDDAR:
                type = "cheddar";
                break;
            case DEEPFRIEDONIONS:
                type = "deep fried onions";
                break;
            case TOMATO:
            default:
                type = "tomato";
        }
        return type;
    }
}
