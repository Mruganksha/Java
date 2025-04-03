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