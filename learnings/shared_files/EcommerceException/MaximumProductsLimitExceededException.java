package assQuestion13;

public class MaximumProductsLimitExceededException extends Exception {
	/**
     * Custom exception raised when the maximum limit of units of a single product
     * in the cart is exceeded.
     */
    private String productName;
    private int maxLimit;

    public MaximumProductsLimitExceededException(String productName, int maxLimit) {
        super("You can only add up to " + maxLimit + " units of '" + productName + "' to the cart.");
        this.productName = productName;
        this.maxLimit = maxLimit;
    }

    public String getProductName() {
        return productName;
    }

    public int getMaxLimit() {
        return maxLimit;
    }

    public static void addToCart(String productName, int quantity) throws MaximumProductsLimitExceededException {
        final int MAX_LIMIT = 5;
        if (quantity > MAX_LIMIT) {
            throw new MaximumProductsLimitExceededException(productName, MAX_LIMIT);
        }
        System.out.println("Added " + quantity + " units of '" + productName + "' to the cart.");
    }

    public static void main(String[] args) {
        try {
            addToCart("Laptop", 6);
        } catch (MaximumProductsLimitExceededException e) {
            System.out.println(e.getMessage());
        }

        try {
            addToCart("Headphones", 3);
        } catch (MaximumProductsLimitExceededException e) {
            System.out.println(e.getMessage());
        }
    }
}
