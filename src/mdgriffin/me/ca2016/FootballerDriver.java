package mdgriffin.me.ca2016;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;

/**
 * Created by t00187715 on 27/03/2017.
 */
public class FootballerDriver {

    public static void main (String[] args) {
        boolean addMore = true;
        TreeSet<Player> footballers = new TreeSet<>();

        while (addMore) {

            String name = JOptionPane.showInputDialog("What is the name");
            int age = Integer.parseInt(JOptionPane.showInputDialog("What is the age"));
            String team = JOptionPane.showInputDialog("What team does the player play for?");

            footballers.add(new Footballer(name, age, team));

            int selection = JOptionPane.showConfirmDialog(
                    null,
                    "Would you like to add more players?",
                    "Confirm",
                    JOptionPane.YES_NO_CANCEL_OPTION
            );

            if (selection != JOptionPane.YES_OPTION) {
                addMore = false;
            }
        }

        JOptionPane.showMessageDialog(null, playerSetToString(footballers), "Order By Age", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

    public static void filterOver30 (TreeSet<Player> players) {
        Iterator<Player> playerIterator = players.iterator();
        String message = "";

        while(playerIterator.hasNext()) {
            Player nextPlayer = playerIterator.next();

            if (nextPlayer.getAge() > 30) {
                message += nextPlayer.toString() + "\n\n";
            }
        }

        JOptionPane.showMessageDialog(null, message);
    };

    public static String playerSetToString (TreeSet players) {
        Iterator<Player> playerIterator = players.iterator();
        String message = "";

        while(playerIterator.hasNext()) {
            Player nextPlayer = playerIterator.next();

            message += nextPlayer.toString() + "\n\n";
        }

        return message;
    }
}
