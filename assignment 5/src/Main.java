/*You are developing a vehicle rental system for a company. The system needs to handle different types of vehicles, their rental pricing, and unique features.
Requirements:

    Abstract Class - Vehicle
        Should have attributes like brand, model, and rentalPrice.
        Should have an abstract method calculateRentalPrice(int days).
        Should have a final method displayInfo() to print vehicle details.

    Concrete Classes (Inheritance):
        Car (extends Vehicle)
            Has seatCapacity and implements calculateRentalPrice().
        Bike (extends Vehicle)
            Has engineCapacity and implements calculateRentalPrice().

    Final Class - LuxuryCar (Cannot be inherited further)
        Extends Car and overrides calculateRentalPrice() with luxury charges.

    Main Class (RentalService)
        Create objects of Car, Bike, and LuxuryCar.
        Demonstrate polymorphism and method overriding.*/

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args){
        Car car = new Car("Toyota", "xuv", 50000, 4);
        car.displayInfo();
        car.calculateRentalPrice(3);

        Bike bike = new Bike("honda", "Rrr", 20000, 150);
        bike.displayInfo();
        bike.calculateRentalPrice(3);

        LuxuryCar luxuryCar = new LuxuryCar("BMW", "X0", 1000000, 4, 5000);

        System.out.println("enter the code to access luxuryCars?");
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();
        luxuryCar.setter(1234);

        if(code == luxuryCar.getter()){
            System.out.println("Access Granted!");
            luxuryCar.displayInfo();
            luxuryCar.calculateRentalPrice(3);
        }
        else{
            System.out.println("Access Denied!");
        }
    }
}