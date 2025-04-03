/*Traffic Light System
Simulate a traffic light system using conditional statements.
The program should take user input for a light color (Red, Yellow, Green) and display the corresponding action:
Red: Stop
Yellow: Get Ready
Green: Go
If the user enters an invalid color, display "Invalid Input".*/

import java.util.*;
public class traffic {
    public static void displayAction(String color){
        switch(color){
            case "red":
                System.out.println("Red: Stop ");
                break;
            case "green":
                System.out.println("green: Go");
                break;
            case "yellow":
                System.out.println("yellow: Get Ready");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String color = sc.next();
        displayAction(color);

    }
}
