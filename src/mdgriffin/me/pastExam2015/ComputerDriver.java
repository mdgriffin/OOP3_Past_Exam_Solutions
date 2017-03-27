package mdgriffin.me.pastExam2015;

import javax.swing.*;

public class ComputerDriver {
    public static void main(String[] args) {
        //Laptop myLaptop = Laptop.
        Laptop myLaptop = new Laptop("Toshiba", "RAM", 2000, true);

        Laptop mySecondLaptop = myLaptop.makeLaptop();

        JOptionPane.showMessageDialog(
                null,
                mySecondLaptop.toString(),
                "Message",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

}
