package mdgriffin.me.pastExam2015;

import javax.swing.*;

public class Laptop extends Computer {

    private boolean touchScreen;

    public Laptop (String make, String type, int size, boolean touchScreen) {
        super(make, type, size);
        setTouchScreen(touchScreen);
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public Laptop makeLaptop () {
        String make;
        String type;
        int size;
        String hasTouchScreen;
        boolean touchScreen;

        make = JOptionPane.showInputDialog(
            null,
            "Please enter the make of the Laptop",
            "Enter Make",
            JOptionPane.QUESTION_MESSAGE
        );

        type = JOptionPane.showInputDialog(
            null,
            "Please enter the type of the Laptop memory",
            "Enter Type",
            JOptionPane.QUESTION_MESSAGE
        );

        size = Integer.parseInt(
            JOptionPane.showInputDialog(
                null,
                "Please enter the size of the Laptop memory",
                "Enter Size",
                JOptionPane.QUESTION_MESSAGE
            )
        );

        hasTouchScreen = JOptionPane.showInputDialog(
                null,
                "Does the Laptop have a touchscreen? (Yes or No)",
                "Please enter",
                JOptionPane.QUESTION_MESSAGE
        );

        if (hasTouchScreen.toLowerCase().charAt(0) == 'y') {
            touchScreen = true;
        } else {
            touchScreen = false;
        }

        return  new Laptop(make, type, size, touchScreen);
    }

    public String toString () {
        return super.toString() + "\nHas Touch Screen: " + isTouchScreen();
    }
}
