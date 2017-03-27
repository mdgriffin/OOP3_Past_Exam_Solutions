package mdgriffin.me.pastExam2016;

import javax.swing.*;

public class VehicleDriver {
    public static void main(String[] args) {
        String type = JOptionPane.showInputDialog(
            null,
            "Please enter the type of the Vehicle",
            "Enter Type",
            JOptionPane.QUESTION_MESSAGE
        );

        int numPassengers = Integer.parseInt(
            JOptionPane.showInputDialog(
                null,
                "Please enter the number of passengers of the Vehicle",
                "Enter Type",
                JOptionPane.QUESTION_MESSAGE
            )
        );

        Bus ourBus = new Bus(type, numPassengers);

        JOptionPane.showMessageDialog(
                null,
                ourBus.toString(),
                "Message",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
