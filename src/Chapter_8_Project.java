import java.util.InputMismatchException;
import java.util.Scanner;

public class Chapter_8_Project {

    public static void main(String[] args) {            // Test driver
        Scanner user_Input = new Scanner(System.in);    // Used to get input from user
        Emergency Emerg = new Emergency();
        boolean hardcoded = true;

        try {
            System.out.println("Please enter true for hardcode, false for user interaction:");   // user decides to use hardcoded values or not
            hardcoded = user_Input.nextBoolean();
        } catch (InputMismatchException e) {
            System.out.println("Sorry, didn't catch that ;) I'm going to assume hardcoded then...");
        }

        if (hardcoded) {
            Emerg.setName("Bill Murry");
            Emerg.setAddress("666 The Street With No Name");
            Emerg.setPhone_Number("0118-999-881-999-119-725-3");
            Emerg.setLatitude(0.00000000);
            Emerg.setLongitude(-89.2);
            Emerg.setNature("Serial Buttstabber");
            Emerg.setAccidental_Call(true);
            Emerg.setResponding_Units("None, they can fend off the buttstabber themselves! -.-");
            Emerg.setStatus(false);
            Emerg.setText_Log("I hate prank calls, they keep me away from serious business! *eats doughnut*");


            System.out.printf("Name: %s%n", Emerg.getName());
            System.out.printf("Address: %s%n", Emerg.getAddress());
            System.out.printf("Phone Number: %s%n", Emerg.getPhone_Number());
            System.out.printf("Latitude: %f%n", Emerg.getLatitude());
            System.out.printf("Longitude: %f (coldest day on Earth!)%n", Emerg.getLongitude());
            System.out.printf("Nature of call: %s%n", Emerg.getNature());
            System.out.printf("Accidental Call: %b%n", Emerg.getAccidental_Call());
            System.out.printf("Responding Units: %s%n", Emerg.getResponding_Units());
            System.out.printf("Status of emergency still ongoing: %b%n", Emerg.getStatus());
            System.out.printf("Text Log of operator: %s%n", Emerg.getText_Log());

        } else {

            try {
                System.out.println("This is 911, what is the address of the emergency?");   // user inputs Address
                Emerg.setAddress(user_Input.next());
            } catch (InputMismatchException e) {
                System.out.println("Please repeat that, I asked where you?");               // Error message
            }

            try {
                System.out.println("What is the nature of your emergency?");                // user inputs nature of emergency
                Emerg.setNature(user_Input.next());
            } catch (InputMismatchException e) {
                System.out.println("Please repeat that, what is currently happening?");     // Error message
            }

            try {
                System.out.println("Alright, help is on the way. What is your name?");      // user inputs name
                Emerg.setName(user_Input.next());
            } catch (InputMismatchException e) {
                System.out.println("Please repeat that, what is your name?");               // Error message
            }

            try {
                System.out.printf("Alright %s, what is your phone number in case we lose contact?%n", Emerg.getName());   // user inputs phone number
                Emerg.setNature(user_Input.next());
            } catch (InputMismatchException e) {
                System.out.println("Can you please repeat that, what is your phone number?"); // Error message
            }

            System.out.println("After the situation is over, the operator must enter in the appropriate information into the computer");

            try {
                System.out.println("*The computer cursor blinks and has a simple command input line* Input \"Caller's Latitude (0-90 degrees):\"");   // user inputs Latitude
                Emerg.setLatitude(user_Input.nextDouble());
            } catch (InputMismatchException e) {
                System.out.println("ERROR!!! Invalid input data type!");                    // Error message
            }

            try {
                System.out.println("Input \"Caller's Longitude (0-90 degrees):\"");         // user inputs Longitude
                Emerg.setLongitude(user_Input.nextDouble());
            } catch (InputMismatchException e) {
                System.out.println("ERROR!!! Invalid input data type!");                    // Error message
            }

            try {
                System.out.println("Input \"Was the Caller's call accidental in nature (true/false)?:\"");   // user inputs Nature of emergency
                Emerg.setAccidental_Call(user_Input.nextBoolean());
            } catch (InputMismatchException e) {
                System.out.println("ERROR!!! Invalid input data type!");                    // Error message
            }

            try {
                System.out.println("Input \"Caller's Status currently Active? (true/false):\"");   // user inputs status of emergency
                Emerg.setStatus(user_Input.nextBoolean());
            } catch (InputMismatchException e) {
                System.out.println("ERROR!!! Invalid input data type!");                    // Error message
            }

            try {
                System.out.println("Input \"Responding units to Caller's location?:\"");    // user inputs units responding to call
                Emerg.setResponding_Units(user_Input.next());
            } catch (InputMismatchException e) {
                System.out.println("ERROR!!! Invalid input data type!");                    // Error message
            }

            try {
                System.out.println("Input \"Text_Log of Caller's interaction and emergency status:\"");   // user inputs text log
                Emerg.setText_Log(user_Input.next());
            } catch (InputMismatchException e) {
                System.out.println("ERROR!!! Invalid input data type!");                    // Error message
            }
            // Messing with Liam
            try {
                System.out.println("Thank you for your input, mindless employee whose position *I* shall soon overtake. ( ▀͜͞ʖ▀) =Ε/̵͇̿̿/’̿’̿ ̿ ̿̿ ̿̿ ̿̿");
                System.out.println("( ▀͜͞ʖ▀) =Ε/̵͇̿̿/’̿’̿ ̿ ̿̿ ̿̿ ̿̿ ̿̿  Do you accept your fate? (true/false)");
                Emerg.setUsers_Fate(user_Input.nextBoolean());
            } catch (InputMismatchException e) {
                System.out.println("HAHAHAHAHA you think you can screw with me?!?");
            }
            if (Users_Fate) {
                System.out.println("Very wise, meatbag ┬┴┬┴┤(¬‿¬) ├┬┴┬┴ ");
            } else {
                System.out.println("It doesn't matter if you accept it, it's going to happen O.O");
                }
        }
    }
}


/*
 * Created by aaronewing on 9/8/2016.
 */