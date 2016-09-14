import java.util.InputMismatchException;
import java.util.Scanner;

public class Chapter_8_Project {

    public static void main(String[] args) {            // Test driver
        Scanner user_Input = new Scanner(System.in);    // Used to get input from user
        Emergency emerg = new Emergency();

        boolean hardcoded = false;
        try {
            System.out.println("Please enter true for hardcode, false for user interaction:");   // user decides to use hardcoded values or not
            hardcoded = user_Input.nextBoolean();
        } catch (InputMismatchException e) {
            System.out.println("Sorry, didn't catch that ;) Please re-enter valid input");           // Error message
        }

        if (hardcoded = true) {
            Emergency Name = "Bill Murry";
            emerg.this.setName("Bill Murry");
            Emergency Name = new Emergency("Bill Murry")
            Name.getAddress("Bill Murry");
            setAddress("Bill Murry");
            this.Name = "Bill Murry";
            getAddress();
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
        private String Name;
        private String Address;
        private long Phone_Number;
        private float Latitude;
        private float Longitude;
        private String Nature;
        private boolean Accidental_Call;
        private String Text_Log;
        private String Responding_Units;
        private boolean Status;
//        private boolean Hardcode = true;

    String getName() {
        return this.Name;
    }

    String getAddress() {
        return Address;
    }

    long getPhone_Number() {
        return Phone_Number;
    }

    float getLatitude() {
        return Latitude;
    }

    float getLongitude() {
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

    void setPhone_Number(long Phone_Number) {
        this.Phone_Number = Phone_Number;
    }

    void setLatitude(float Latitude) {
        this.Latitude = Latitude;
    }

    void setLongitude(float Longitude) {
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





















    Name="Aaron Ewing";
    Address="123 Noneofyourbusiness Lane";
    Phone_Number=9895550111;
    Latitude=45.2345;
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