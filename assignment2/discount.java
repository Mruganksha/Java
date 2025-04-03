/*The program should allow the user to select a discount type:
1 → Festival Offer (10%)
2 → Membership Offer (15%)
3 → No Discount
Accept the original price from the user and calculate the final price after applying the selected discount.*/
import java.util.*;

public class discount {
    public static void main(String args[]){
        double Discount = 0;
        double price;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the orignal Price:");
        price = sc.nextDouble();

        System.out.println("1.Festival Offer");
        System.out.println("2.Membership Offer");
        System.out.println("3.No discount");
        System.out.println("enter the no. of discount type:");
        int num = sc.nextInt();
        switch(num){
            case 1:
                Discount = 0.10 * price;
                break;
            case 2:
                Discount = 0.15 * price;
                break;
            case 3:
                Discount = 0;
                break;
            default:
                System.out.println("Invalid Input");
        }
        double finalPrice = price - Discount;
        System.out.println("Final Proice : " + finalPrice);
    }
}
