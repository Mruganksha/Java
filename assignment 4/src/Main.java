public class Main {
    public static void main(String[] args){
        EconomyClass E1 = new EconomyClass(789);
        BuissnessClass B1 = new BuissnessClass(500);
        FirstClass F1 = new FirstClass(400);

        E1.bookTicket("Mru", "Economy Class");
        B1.bookTicket("abc", "buisness Class");
        F1.bookTicket("xyz", "First Class", "Two times");

        B1.cancelTicket(500);

        E1.DisplayDetails();
        B1.DisplayDetails();
        F1.DisplayDetails();

    }
}
