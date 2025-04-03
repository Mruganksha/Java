/*Develop an Airline Reservation System where users can book flights, choose seat types, and check ticket status.

Concepts Used:

Encapsulation: Store passenger details (name, ticket number, seat type) as private attributes.
Constructor: Initialize flights with default attributes.
Inheritance: Flight class, extended by EconomyClass, BusinessClass, FirstClass.
Method Overloading: bookTicket() allows booking based on passenger details, seat class, and meal preferences.
Method Overriding: Different baggage allowances and services for each class.
Interface: Cancelable interface for flight cancellations.*/

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
