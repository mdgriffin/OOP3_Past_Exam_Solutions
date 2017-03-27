package mdgriffin.me.pastExam2016;

public abstract class Vehicle implements IDable {

        public static int num = 0;
        String id;
        private int passengerNum;
        private String type;

    public Vehicle(String type, int passengerNum) {
        setPassengerNum(passengerNum);
        setType(type);

        num++;
    }

    public int getPassengerNum() {
        return passengerNum;
    }

    public void setPassengerNum(int passengerNum) {
        this.passengerNum = passengerNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Type: " + getType() + "\nNumber of Passengers: " + getPassengerNum();
    }
}


