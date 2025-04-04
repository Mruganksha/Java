/*1.Implement 6 class generic programs*/
public class Main {
    public static void main(String[] args) {
        GenericContainer<String> container = new GenericContainer<>();
        container.addItem("Hello");
        container.addItem("Hi");
        System.out.println("Container Items: " + container.getItems());

        KeyValuePair<String, Integer> pair = new KeyValuePair<>("Age", 30);
        System.out.println("KeyValuePair: " + pair.getKey() + " == " + pair.getValue());

        GenericStack<Integer> stack = new GenericStack<>();
        stack.push(100);
        stack.push(50);
        System.out.println("Stack Pop: " + stack.pop());

        GenericQueue<String> queue = new GenericQueue<>();
        queue.enqueue("First");
        queue.enqueue("Second");
        System.out.println("Queue Dequeue: " + queue.dequeue());

        GenericHashSet<Integer> hashSet = new GenericHashSet<>();
        hashSet.addElement(5);
        hashSet.addElement(10);
        hashSet.addElement(5);
        hashSet.displaySet();

        GenericCalculator<Double> calculator = new GenericCalculator<>();
        System.out.println("Sum: " + calculator.add(10.5, 20.3));
        System.out.println("Multiplication: " + calculator.multiply(4.2, 3.1));
    }
}