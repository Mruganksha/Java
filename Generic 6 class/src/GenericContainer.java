import java.util.ArrayList;

public class GenericContainer <T> {
    private ArrayList<T> items;

    public GenericContainer() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public ArrayList<T> getItems() {
        return items;
    }
}

