package assQuestion23;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	public static void main(String[] args) {
        // List to hold the shopping cart
        List<Product> cart = new ArrayList<>();

        // Adding products to the cart
        cart.add(new Product("Laptop", 75000.0));
        cart.add(new Product("Smartphone", 30000.0));
        cart.add(new Product("Headphones", 2000.0));

        // Billing process
        if (cart.isEmpty()) {
            System.out.println("Can we help you in finding what you were looking for?");
        } else {
            double totalCost = 0.0;

            System.out.println("Billing Details:");
            for (Product product : cart) {
                System.out.println(product.getName() + " - Rs. " + product.getPrice());
                totalCost += product.getPrice();
            }

            System.out.println("Total Bill Amount: Rs. " + totalCost);
        }
    }
}
