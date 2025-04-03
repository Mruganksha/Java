/*Banking System - PIN Validation
•	A bank ATM requires users to enter a 4-digit PIN to proceed.
•	The user gets 3 attempts to enter the correct PIN.
•	If the correct PIN is entered, print "Access Granted".
•	If all attempts are used up, print "Account Locked".
•	Implement this using appropriate loop*/

import java.util.*;

public class pin {
    public static void main(String args[]){
        int correct_pin = 1234;
        int max = 3;
        int attempt = 0;
        Scanner sc = new Scanner(System.in);

        while(attempt < max){
            System.out.println("Enter your PIN : ");
            int enter = sc.nextInt();

            if(enter == correct_pin){
                System.out.println("Access Granted");
                sc.close();
                return;
            }
            else{
                attempt++;
                if(attempt < max){
                    System.out.println("Incorrect PIN");
                }
            }
        }
        System.out.println("Account Locked");
        sc.close();
    }
}
