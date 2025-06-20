public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileUser = new MobileApp("Ajay");
        Observer webUser = new WebApp("Anita");

        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        stockMarket.setStock("TCS", 3712.5);
        stockMarket.setStock("Infosys", 1445.0);

        stockMarket.removeObserver(webUser);

        stockMarket.setStock("Wipro", 426.8);
    }
}
