package inventory;

import java.util.HashMap;
import java.util.Map;

public class inventorymanager {
    private Map<String, product> inventory;

    public inventorymanager() {
        inventory = new HashMap<>();
    }

    // Add product
    public void addProduct(product product) {
        inventory.put(product.getProductId(), product);
    }

    // Update product
    public boolean updateProduct(String productId, int quantity, double price) {
        product product = inventory.get(productId);
        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
            return true;
        }
        return false;
    }

    // Delete product
    public boolean deleteProduct(String productId) {
        return inventory.remove(productId) != null;
    }

    // View product
    public product getProduct(String productId) {
        return inventory.get(productId);
    }

    // List all products
    public void listProducts() {
        for (product product : inventory.values()) {
            System.out.println(product);
        }
    }
}

