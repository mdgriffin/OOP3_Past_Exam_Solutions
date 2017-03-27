package mdgriffin.me.pastExam2015;

public class Memory {

    private String type;
    private int size;

    public Memory (String type, int size) {
        setType(type);
        setSize(size);
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String toString () {
        return "Memory Type: " + getType() + "\nMemory Size: " + getSize();
    }
}

