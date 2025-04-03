//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Vector;
public class Main {
    public static void main(String[] args) {
        Vector<String> stationaryItems = new Vector<>();


        stationaryItems.add("Pen");
        stationaryItems.add("Pencil");
        stationaryItems.add("Notebook");
        stationaryItems.add("Eraser");
        stationaryItems.add("Marker");
        System.out.println("After adding items: " + stationaryItems);

        stationaryItems.add(2, "Sharpener");
        System.out.println("After adding Sharpener to index 2: " + stationaryItems);

        stationaryItems.remove("Eraser");
        System.out.println("After removing Eraser: " + stationaryItems);

        stationaryItems.remove(3);
        System.out.println("After removing item at index 3: " + stationaryItems);

        System.out.println("Size of vector: " + stationaryItems.size());

        System.out.println("Element at index 1: " + stationaryItems.get(1));

        stationaryItems.set(0, "Highlighter");
        System.out.println("After replacing element at index 0: " + stationaryItems);


        System.out.println("Is vector empty? " + stationaryItems.isEmpty());


        System.out.println("Does vector contain Pencil? " + stationaryItems.contains("Pencil"));

    }
}