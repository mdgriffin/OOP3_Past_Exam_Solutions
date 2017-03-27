package mdgriffin.me.pastExam2016;

public class Bus extends Vehicle {

    private String id;

    public Bus ( String type, int passengerNum) {
        super(type, passengerNum);
        setId();
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId() {
        this.id = getClass().toString() + num;
    }

    public String toString () {
        return super.toString() + "\nId: " + getId();
    }
}
