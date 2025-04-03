interface Command {
    void execute();
}

// Receiver (Kitchen)
class Kitchen {
    public void prepareOrder() {
        System.out.println("Kitchen is preparing the order...");
    }
}

// Concrete Command
class PrepareOrderCommand implements Command {
    private Kitchen kitchen;

    public PrepareOrderCommand(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public void execute() {
        kitchen.prepareOrder();
    }
}

// Invoker (Waiter)
class Waiter {
    public void takeOrder(Command command) {
        System.out.println("Waiter taking order...");
        command.execute();
    }
}