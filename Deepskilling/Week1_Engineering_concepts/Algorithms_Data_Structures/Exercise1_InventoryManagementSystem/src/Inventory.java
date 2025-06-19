import java.util.HashMap;

public class Inventory {
    private HashMap<Integer, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product added: " + product.getProductName());
    }

    public void updateProduct(int id, int quantity, double price) {
        Product product = inventory.get(id);
        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product updated: " + product);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(int id) {
        Product removed = inventory.remove(id);
        if (removed != null) {
            System.out.println("Product deleted: " + removed.getProductName());
        } else {
            System.out.println("Product not found.");
        }
    }

    public void showInventory() {
        System.out.println("\nInventory List:");
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
}
