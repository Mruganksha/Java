//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculator{
    static double a = 5d;
    static double b = 3d;

    public static double addition(double a, double b){
        return a + b;
    }
    public static double substract(double a, double b){
        return a - b;
    }
    public static double multiplication(double a, double b){
        return a * b;
    }
    public static double divide(double a, double b){
        return a / b;
    }
    public static double modulus(double a, double b){
        return a % b;
    }
    public static double preincrement(double a){
        return ++a;
    }
    public static double predecrement(double a){
        return --a;
    }
    public static double postincrement(double a){
        return a++;
    }
    public static double postdecrement(double a){
        return a--;
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Addition is: " + Calculator.addition(a, b));
        System.out.println("Substraction is: " + Calculator.substract(a, b));
        System.out.println("Multiplication is: " + Calculator.multiplication(a, b));
        System.out.println("Division is: " + Calculator.divide(a, b));
        System.out.println("Modulus is: " + Calculator.modulus(a, b));
        System.out.println("Preincrement is: " + Calculator.preincrement(a));
        System.out.println("PostIncrement is: " + Calculator.postincrement(a));
        System.out.println("predecrement is: " + Calculator.predecrement(a));
        System.out.println("postdecrement is: " + Calculator.postdecrement(a));
    }
}