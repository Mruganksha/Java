import java.io.*;
class Main {
    public static void main(String[] args) {
        Order order = OrderFactory.createOrder("DineIn");
        order.prepareOrder();

        Cuisine cuisine = new IndianCuisineFactory().createCuisine();
        cuisine.cook();

        ComboMeal combo = new ComboMeal.Builder().setMainDish("Burger").setSide("Fries").setDrink("Cola").build();
        combo.showCombo();

        Dish similarDish = DishRegistry.getSimilarDish("PaneerButterMasala");
        System.out.println("Suggested Dish: " + similarDish.getName());

        Kitchen kitchen = new Kitchen();
        Waiter waiter = new Waiter();
        waiter.takeOrder(new PrepareOrderCommand(kitchen));

        OrderStatusNotifier notifier = new OrderStatusNotifier();
        notifier.addCustomer(new RegularCustomer("John"));
        notifier.notifyCustomers("Your order is ready!");
    }
}