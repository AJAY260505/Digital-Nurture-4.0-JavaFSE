public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "Ajay J"));
        context.executePayment(5000);

        context.setPaymentStrategy(new PayPalPayment("ajay@example.com"));
        context.executePayment(2500.75);
    }
}
