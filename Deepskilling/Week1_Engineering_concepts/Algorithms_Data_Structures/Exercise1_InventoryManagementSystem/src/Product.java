public class Product {
    private int productId;
    String productName;
    private int quantity;
    private double price;

    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public Product(int i, String string, String string2) {
        //TODO Auto-generated constructor stub
    }

    // Getters and setters
    public int getProductId() { return productId; }
    public String getProductName() { return productName; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }

    public void setProductName(String name) { this.productName = name; }
    public void setQuantity(int qty) { this.quantity = qty; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return productId + " - " + productName + " | Qty: " + quantity + " | Price: ₹" + price;
    }
}
