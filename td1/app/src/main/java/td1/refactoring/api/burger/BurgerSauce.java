package td1.refactoring.api.burger;

public enum BurgerSauce implements DieteticElement {
    BURGER, BARBECUE, BEARNAISE;

    @Override
    public double calories_per_100g() {
        double cal = 0;
        switch (this) {
            case BARBECUE:
                cal = 130;
                break;
            case BEARNAISE:
                cal = 550;
                break;
            case BURGER:
            default:
                cal = 240;
        }
        return cal;
    }
}
