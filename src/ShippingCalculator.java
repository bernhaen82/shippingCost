import java.util.Scanner;

public class ShippingCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of the item: ");
        double itemPrice = scanner.nextDouble();

        scanner.close();

        double shippingCost;
        if (itemPrice >= 100.0) {
            shippingCost = 0.0;
        } else {
            // Shipping is 2% of the item price if it's less than $100
            shippingCost = 0.02 * itemPrice;
        }

        double totalPrice = itemPrice + shippingCost;

        System.out.println("Shipping Cost: " + shippingCost);
        System.out.println("Total Price: " + totalPrice);
    }
}