public class LaptopMousePrice {
    public static void main(String[] args) {
        int laptopPrice = 85000;
        int mousePrice = 2500;
        int totalItems = 1; // Number of laptops and mice

        // Calculate total price before discount
        int totalPriceBeforeDiscount = (laptopPrice * totalItems) + (mousePrice * totalItems);

        // Calculate discount amount
        double discountRate = 0.15; // 15% discount
        int discountAmount = (int) (totalPriceBeforeDiscount * discountRate);

        // Calculate total price after discount
        int totalPriceAfterDiscount = totalPriceBeforeDiscount - discountAmount;

        System.out.println("Total price after discount: " + totalPriceAfterDiscount + " TK");
    }
}