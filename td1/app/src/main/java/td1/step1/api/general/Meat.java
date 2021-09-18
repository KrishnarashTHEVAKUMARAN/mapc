package td1.step1.api.general;

public class Meat implements FoodProduct {

    public enum MeatType implements Food {
        BEEF, WHITEFISH;

        @Override
        public double calories_per_100g() {
            double cal;
            switch (this) {
                case WHITEFISH:
                    cal = 170;
                    break;
                case BEEF:
                default:
                    cal = 200;
            }
            return cal;
        }

        public double price() {
            double price;
            switch (this) {
                case WHITEFISH:
                    price = 6;
                    break;
                case BEEF:
                default:
                    price = 4;
            }
            return price;
        }
    }

    private MeatType type;
    private double weight;

    public Meat(MeatType type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public double price() {
        return type.price() * weight / 100;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double calories_per_100g() {
        return type.calories_per_100g();
    }

    @Override
    public String toString() {
        return String.format("%s (%.0fg) -- %.2f€", type, weight(), price());
    }
}
