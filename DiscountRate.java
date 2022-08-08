public class DiscountRate {
    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    private static double productDiscountPremium = 0.2;
    private static double productDiscountGold = 0.15;
    private static double productDiscountSilver = 0.1;

    public static double getServiceDiscountRate(String type) {
        if (type.equals("Premium")) {
            return serviceDiscountPremium;
        }
        if (type.equals("Gold")) {
            return serviceDiscountGold;
        }
        if (type.equals("Sliver")) {
            return serviceDiscountPremium;
        }
        return 0.0;
    }
    public static double getProductDiscountRate(String type) {
        if (type.equals("Premium")) {
            return productDiscountPremium;
        }
        if (type.equals("Gold")) {
            return productDiscountGold;
        }
        if (type.equals("Sliver")) {
            return productDiscountSilver;
        }
        return 0.0;
    }
}
