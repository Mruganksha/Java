import java.util.*;

public class s1 {



    /*
    //take user input od three cost and give bill
    static class cost{
        float pencil;
        float pen;
        float eraser;

        float bill(){
            float sum = this.pencil + this.pen + this.eraser;
            return sum;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        cost c1 = new cost();
        c1.pencil = sc.nextFloat();
        c1.pen = sc.nextFloat();
        c1.eraser = sc.nextFloat();

        float result = c1.bill();
        System.out.println("bill is : " + result);

        float gst = result * 0.18f; // 18% GST
        float totalCostWithGST = result + gst;
        System.out.println("cost with gst : " + totalCostWithGST);
    }
    */

    /*
    //swap without using temp
     public static void main(String args[]){
         int a = 5;
         int b = 10;

         System.out.println("a = " + a);
         System.out.println("b = " + b);
         a = a + b;
         b = a - b;
         a = a - b;
         System.out.println("after swap");
         System.out.println("a = " + a);
         System.out.println("b = " + b);
     }
     */

    /*
    //Design a Car class with attributes like make, model, year, and color. Implement methods to display car details and change the car color.
    static class car{
        int model;
        int year;
        String color;

        car(int model, int year, String color){
            this.model = model;
            this.year = year;
            this.color = color;
        }

        void display(){
            System.out.println(this.model);
            System.out.println(this.year);
            System.out.println(this.color);
        }

        void changeColor(String newcolor){
            this.color = newcolor;
            System.out.println("the new color is: " + this.color);
        }

    }
    public static void main(String args[]){
        car c1 = new car(15, 2005, "red");
        System.out.println("car 1: ");
        c1.display();
        car c2 = new car(11, 2014, "blue");
        System.out.println("car 2: ");
        c2.display();
        c2.changeColor("white");
    } */
}
