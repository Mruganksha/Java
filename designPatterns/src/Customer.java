import java.util.ArrayList;
import java.util.List;

interface Customer {
    void update(String message);
}

// Concrete Observer
class RegularCustomer implements Customer {
    private String name;

    public RegularCustomer(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}

// Subject (Observable)
class OrderStatusNotifier {
    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void notifyCustomers(String message) {
        for (Customer customer : customers) {
            customer.update(message);
        }
    }
}