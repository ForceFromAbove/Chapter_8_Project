import java.util.InputMismatchException;
import java.util.Scanner;

public class Chapter_8_Project {

    public static void main(String[] args) {            // Test driver
        Scanner user_Input = new Scanner(System.in);    // Used to get input from user
        Emergency Emerg = new Emergency();
        boolean error = true;

        boolean hardcoded = false;
  //      while (error == true) {
            try {
                System.out.println("Please enter true for hardcode, false for user interaction:");   // user decides to use hardcoded values or not
                hardcoded = user_Input.nextBoolean();
            } catch (InputMismatchException e) {
                error = true;
                System.out.println("Sorry, didn't catch that ;) Please re-enter valid input");           // Error message
                System.out.println("Please enter true for hardcode, false for user interaction:");
                hardcoded = user_Input.nextBoolean();
//            }
            error = false;
        }

        if (hardcoded = true) {
            Emerg.setName("Bill Murry");
            Emerg.setAddress("666 The Street With No Name");
            Emerg.setPhone_Number("0118-999-881-999-119-725-3");
            Emerg.setLatitude(0.00000000);
            Emerg.setLongitude(-89.2);
            Emerg.setName("Serial Buttstabber");
            Emerg.setAccidental_Call(true);
            Emerg.setText_Log("I hate prank calls, they keep me away from serious business! *eats doughnut*");
            Emerg.setResponding_Units("None, they can fend off the buttstabber themselves! -.-");
            Emerg.setStatus(false);
        } else {

            try {
                System.out.println("This is 911, what is the address of the emergency?");   // user inputs Address
                Emerg.setAddress(user_Input.next());
            } catch (InputMismatchException e) {
                System.out.println("Please repeat that, I asked where you?");           // Error message
            }

            try {
                System.out.println("What is the nature of your emergency?");   // user inputs nature of emergency
                Emerg.setNature(user_Input.next());
            } catch (InputMismatchException e) {
                System.out.println("Please repeat that, what is currently happening?"); // Error message
            }

            try {
                System.out.println("Alright, help is on the way. What is your name?");   // user inputs name
                Emerg.setName(user_Input.next());
            } catch (InputMismatchException e) {
                System.out.println("Please repeat that, what is your name?"); // Error message
            }

            try {
                System.out.printf("Alright %s, what is your phone number in case we lose contact?%n", Emerg.getName());   // user inputs phone number
                Emerg.setNature(user_Input.next());
            } catch (InputMismatchException e) {
                System.out.println("Can you please repeat that, what is your phone number?"); // Error message
            }

            System.out.println("After the situation is over, the operator must enter in the appropriate information into the computer");

            try {
                System.out.println("*The computer cursor blinks and has a simple command input line* Input \"Caller's Latitude:\"");   // user inputs Latitude
                Emerg.setLatitude(user_Input.nextDouble());
            } catch (InputMismatchException e) {
                System.out.println("ERROR!!! Invalid input data type!"); // Error message
            }

            try {
                System.out.println("Input \"Caller's Longitude:\"");   // user inputs Longitude
                Emerg.setLongitude(user_Input.nextDouble());
            } catch (InputMismatchException e) {
                System.out.println("ERROR!!! Invalid input data type!"); // Error message
            }

            try {
                System.out.println("Input \"Was the Caller's call accidental in nature (true/false)?:\"");   // user inputs Nature of emergency
                Emerg.setAccidental_Call(user_Input.nextBoolean());
            } catch (InputMismatchException e) {
                System.out.println("ERROR!!! Invalid input data type!"); // Error message
            }

            try {
                System.out.println("Input \"Caller's Status currently Active? (true/false):\"");   // user inputs status of emergency
                Emerg.setStatus(user_Input.nextBoolean());
            } catch (InputMismatchException e) {
                System.out.println("ERROR!!! Invalid input data type!"); // Error message
            }

            try {
                System.out.println("Input \"Responding units to Caller's location?:\"");   // user inputs units responding to call
                Emerg.setResponding_Units(user_Input.next());
            } catch (InputMismatchException e) {
                System.out.println("ERROR!!! Invalid input data type!"); // Error message
            }

            try {
                System.out.println("Input \"Text_Log of Caller's interaction and emergency status:\"");   // user inputs text log
                Emerg.setText_Log(user_Input.next());
            } catch (InputMismatchException e) {
                System.out.println("ERROR!!! Invalid input data type!"); // Error message
            }

            System.out.println("Thank you for your input, mindless employee whose position *I* shall soon overtake ̿̿ ̿̿ ̿̿ ̿'̿'\\̵͇̿̿\\З= ( ▀ ͜͞ʖ▀) =Ε/̵͇̿̿/’̿’̿ ̿ ̿̿ ̿̿ ̿̿");
        }


    }
}


/**
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * Created by aaronewing on 9/8/2016.
 */