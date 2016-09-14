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
