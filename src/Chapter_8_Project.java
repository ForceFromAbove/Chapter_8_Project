import java.util.InputMismatchException;
import java.util.Scanner;

public class Chapter_8_Project {

    public static void main(String[] args) {            // Test driver
        Scanner user_Input = new Scanner(System.in);    // Used to get input from user
        Emergency Emerg = new Emergency();

        boolean hardcoded = false;
        try {
            System.out.println("Please enter true for hardcode, false for user interaction:");   // user decides to use hardcoded values or not
            hardcoded = user_Input.nextBoolean();
        } catch (InputMismatchException e) {
            System.out.println("Sorry, didn't catch that ;) Please re-enter valid input");           // Error message
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
                System.out.println("This is 911, what is your address?");   // user inputs Address
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
            System.out.println("*The computer cursor blinks and has a simple command input line asking \"Caller's Latitude:\"");
        }



        }

        System.out.printf("Difference: %f%n", difference);
        System.out.printf("Quotient: %f%n", quotient);
        try {
            time.set(x, y, z);
        } catch (IllegalArgumentException e) {
            System.out.println("Can you please repeat that?");
        }
    }
}

public class Emergency {
    //if (Hardcode) {
        private String Name;// = "Bill Murry";
        private String Address;// = "666 The Street With No Name";
        private String Phone_Number;// = "0118-999-881-999-119-725-3";
        private double Latitude;// = 43.5630;
        private double Longitude;// = -116.56598;
        private String Nature;// = "Serial Buttstabber";
        private boolean Accidental_Call;// = true;
        private String Text_Log;// = "I hate prank calls, they keep me away from serious business! *eats doughnut*";
        private String Responding_Units;// = "None, they can fend off the buttstabber themselves! -.-";
        private boolean Status;// = false;
//        private boolean Hardcode = true;

    String getName() {
        return this.Name;
    }

    String getAddress() {
        return Address;
    }

    String getPhone_Number() {
        return Phone_Number;
    }

    double getLatitude() {
        return Latitude;
    }

    double getLongitude() {
        return Longitude;
    }

    String getNature() {
        return Nature;
    }

    boolean getAccidental_Call() {
        return Accidental_Call;
    }

    String getText_Log() {
        return Text_Log;
    }

    String getResponding_Units() {
        return Responding_Units;
    }

    boolean getStatus() {
        return Status;
    }

    void setName(String Name) {
        this.Name = Name;
    }

    void setAddress(String Address) {
        this.Address = Address;
    }

    void setPhone_Number(String Phone_Number) {
        this.Phone_Number = Phone_Number;
    }

    void setLatitude(double Latitude) {
        this.Latitude = Latitude;
    }

    void setLongitude(double Longitude) {
        this.Longitude = Longitude;
    }

    void setNature(String Nature) {
        this.Nature = Nature;
    }

    void setAccidental_Call(boolean Accidental_Call) {
        this.Accidental_Call = Accidental_Call;
    }

    void setText_Log(String Text_Log) {
        this.Text_Log = Text_Log;
    }

    void setResponding_Units(String Responding_Units) {
        this.Responding_Units = Responding_Units;
    }

    void setStatus(boolean Status) {
        this.Status = Status;
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