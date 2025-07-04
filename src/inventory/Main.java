package inventory;

public class Main {
    public static void main(String[] args) {
        inventorymanager manager = new inventorymanager();

        product p1 = new product("P001", "Laptop", 10, 1500.00);
        product p2 = new product("P002", "Monitor", 20, 300.00);
        product p3 = new product("P003", "Keyboard", 50, 25.00);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        manager.listProducts();

        System.out.println("\nUpdating Monitor...");
        manager.updateProduct("P002", 15, 280.00);

        System.out.println("\nDeleting Keyboard...");
        manager.deleteProduct("P003");

        System.out.println("\nCurrent Inventory:");
        manager.listProducts();
    }
}
