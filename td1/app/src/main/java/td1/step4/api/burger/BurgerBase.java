package td1.step4.api.burger;

import td1.step4.api.restauration.Base;

public enum BurgerBase implements Base {
    BURGER, BARBECUE, BEARNAISE, BEEF, WHITEFISH, CHEDDAR, DEEPFRIEDONIONS, TOMATO;

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
                cal = 550;
                break;
            case BEEF:
                cal = 200;
                break;
            case WHITEFISH:
                cal = 170;
                break;
            case CHEDDAR:
                cal = 400;
                break;
            case DEEPFRIEDONIONS:
                cal = 590;
                break;
            case TOMATO:
            default:
                cal = 21;
        }
        return cal;
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
        boolean uniquePrice;
        switch (this) {
            case BURGER:
            case BARBECUE:
            case BEARNAISE:
                uniquePrice = true;
                break;
            default:
                uniquePrice = false;
        }
        return uniquePrice;
    }

    @Override
    public String toString() {
        String typeName;
        switch (this) {
            case BURGER:
                typeName = "BURGER sauce";
                break;
            case BARBECUE:
                typeName = "BARBECUE sauce";
                break;
            case BEARNAISE:
                typeName = "BEARNAISE sauce";
                break;
            case BEEF:
                typeName = "BEEF";
                break;
            case WHITEFISH:
                typeName = "WHITEFISH";
                break;
            case CHEDDAR:
                typeName = "cheddar";
                break;
            case DEEPFRIEDONIONS:
                typeName = "deep fried onions";
                break;
            case TOMATO:
            default:
                typeName = "tomato";
        }
        return typeName;
    }
}
