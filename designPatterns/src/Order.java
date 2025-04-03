public interface Order {
    void prepareOrder();
}

// Concrete Order Types
class DineInOrder implements Order {
    public void prepareOrder() {
        System.out.println("Dine-In Order is being prepared.");
    }
}

class TakeawayOrder implements Order {
    public void prepareOrder() {
        System.out.println("Takeaway Order is being prepared.");
    }
}

class OnlineOrder implements Order {
    public void prepareOrder() {
        System.out.println("Online Order is being prepared.");
    }
}

// Factory to create order
class OrderFactory {
    public static Order createOrder(String type) {
        switch (type) {
            case "DineIn": return new DineInOrder();
            case "Takeaway": return new TakeawayOrder();
            case "Online": return new OnlineOrder();
            default: throw new IllegalArgumentException("Invalid order type.");
        }
    }
}