package mdgriffin.me.pastExam2015;

public class Computer implements IDable, Comparable<Computer> {

    private static int num = 0;
    private String id;
    private String make;
    private Memory mem;


    public Computer (String make, String memoryType, int memorySize) {
        setMake(make);
        setMem(new Memory(memoryType, memorySize));
        setId(getClass().toString() + num);
        num++;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Memory getMem() {
        return mem;
    }

    public void setMem(Memory mem) {
        this.mem = mem;
    }

    @Override
    public int compareTo(Computer computer) {
        return getId().compareTo(computer.getId());
    }

    public String toString () {
        return "Id: " + getId() + "\nMake: " + getMake() + "\n" + mem.toString();
    }

}
