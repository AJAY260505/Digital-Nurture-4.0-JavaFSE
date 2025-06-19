class Order {
    int orderId;
    String customerName;
    double totalPrice;

    public Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "OrderID: " + orderId + ", Customer: " + customerName + ", Total: ₹" + totalPrice;
    }
}

public class SortingOrders {

    // Bubble Sort
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    // Quick Sort
    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].totalPrice;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice < pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }

        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }

    public static void printOrders(String title, Order[] orders) {
        System.out.println("\n" + title);
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Ajay", 3500),
            new Order(102, "Bala", 1200),
            new Order(103, "Charan", 8000),
            new Order(104, "Deepa", 2300)
        };

        // Bubble Sort
        Order[] bubbleSortedOrders = orders.clone();
        bubbleSort(bubbleSortedOrders);
        printOrders("Bubble Sorted Orders (by Price):", bubbleSortedOrders);

        // Quick Sort
        Order[] quickSortedOrders = orders.clone();
        quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        printOrders("Quick Sorted Orders (by Price):", quickSortedOrders);
    }
}
