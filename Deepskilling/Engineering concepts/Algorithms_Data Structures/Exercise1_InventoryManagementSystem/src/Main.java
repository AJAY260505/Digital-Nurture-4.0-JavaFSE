public class Main {
    public static void main(String[] args) {
        Inventory inv = new Inventory();

        Product p1 = new Product(101, "Keyboard", 50, 499.99);
        Product p2 = new Product(102, "Mouse", 70, 299.50);

        inv.addProduct(p1);
        inv.addProduct(p2);

        inv.updateProduct(101, 45, 479.99);
        inv.deleteProduct(102);

        inv.showInventory();
    }
}
