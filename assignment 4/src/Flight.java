

import java.util.Scanner;

interface cancel{
    void cancelTicket(int TicketNo);
}

public class Flight implements cancel{
    private String PassengerName;
    private int TicketNo;
    int flightNo;
    String SeatType;

    Flight(int flightNo){
        this.flightNo = flightNo;
    }

    void bookTicket(String PassengerName , String SeatType){
        this.PassengerName = PassengerName;
        this.SeatType = SeatType;
        System.out.println("Ticket is booked for - " + PassengerName + " of seat type" + SeatType);
    }
    //overloading
    void bookTicket(String PassengerName , String SeatType, String mealPref){
        this.PassengerName = PassengerName;
        this.SeatType = SeatType;
        System.out.println("Ticket is booked for - " + PassengerName + " of seat type" + SeatType + " with meal prefrence of " + mealPref);
    }

    //overriding method
    public String luggageAllowance(){
        return "Standard is of 7kg.";
    }

    public String getServices(){
        return "Waterbottle";
    }

    public void cancelTicket(int TicketNo){
        System.out.println("Ticket number : " + TicketNo + " has been cancelled.");
    }

    void DisplayDetails(){
        System.out.println("Name of Passenger: " + this.PassengerName);
        System.out.println("Ticket number: " + this.TicketNo);
        System.out.println("flight Number: " + this.flightNo);
        System.out.println("seat type: " + this.SeatType);
        getServices();
        luggageAllowance();
    }
}

class EconomyClass extends Flight{
    public EconomyClass(int flightNo){
        super(flightNo);
    }

    public String luggageAllowance(){
        return "Standard is of 20kg.";
    }

    public String getServices(){
        return "Waterbottle + 2 meals";
    }
}

class BuissnessClass extends Flight{
    public BuissnessClass(int flightNo){
        super(flightNo);
    }

    public String luggageAllowance(){
        return "Standard is of 15kg.";
    }

    public String getServices(){
        return "Waterbottle + 1 meals";
    }
}

class FirstClass extends Flight{
    public FirstClass(int flightNo){
        super(flightNo);
    }
    public String luggageAllowance(){
        return "Standard is of 10kg.";
    }
    public String getServices(){
        return "Waterbottle + Breakfast";
    }
}


