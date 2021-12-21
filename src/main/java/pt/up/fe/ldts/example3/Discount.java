package pt.up.fe.ldts.example3;

public class Discount {
    private final int fixed;
    private final double percentage;

    public Discount(int fixed, double percentage) {
        this.fixed = fixed;
        this.percentage = percentage;
    }

    public double applyDiscount(double price) {
        double discountedPrice = price;

        if (fixed > 0) discountedPrice = fixed > price ? 0 : price - fixed;
        else if (percentage > 0) discountedPrice = price - price * percentage;
        else discountedPrice = price;

        return discountedPrice;
    }
}
