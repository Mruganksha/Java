abstract class Vehicle {
    String brand;
    String model;
    int rentalPrice;

    public Vehicle(String brand, String model, int rentalPrice) {
        this.brand = brand;
        this.model = model;
        this.rentalPrice = rentalPrice;
    }

    public abstract void calculateRentalPrice(int days);

    public final void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Rental Price per day: " + rentalPrice);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    public Car(String brand, String model, int rentalPrice, int seatCapacity) {
        super(brand, model, rentalPrice);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void calculateRentalPrice(int days) {
        System.out.println("No. of Days: " + days);
        int finalPrice = rentalPrice * days;
        System.out.println("Final Price : " + finalPrice);
    }
}

class Bike extends Vehicle {
    int engineCapacity;

    public Bike(String brand, String model, int rentalPrice, int engineCapacity) {
        super(brand, model, rentalPrice);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void calculateRentalPrice(int days) {
        System.out.println("No. of Days: " + days);
        int finalPrice = rentalPrice * days;
        System.out.println("Final Price : " + finalPrice);
    }
}

final class LuxuryCar extends Car {
    int luxuryCharges;
    private int code;
    public LuxuryCar(String brand, String model, int rentalPrice, int seatCapacity, int luxuryCharges) {
        super(brand, model, rentalPrice, seatCapacity);
        this.luxuryCharges = luxuryCharges;
    }

    @Override
    public void calculateRentalPrice(int days) {
        System.out.println("No. of Days: " + days);
        int finalPrice = (rentalPrice + luxuryCharges) * days;
        System.out.println("Final Prices: " + finalPrice);
    }
    public void setter(int code){
        this.code = code;
    }

    public int getter(){
        return code;
    }
}

