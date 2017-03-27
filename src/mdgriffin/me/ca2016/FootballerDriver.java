package mdgriffin.me.ca2016;

import javax.swing.*;
import java.util.*;

public class FootballerDriver {

    public static void main (String[] args) {
        boolean addMore = true;
        HashSet<Footballer> footballers = new HashSet<>();

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

        JOptionPane.showMessageDialog(null, playerSetToString(footballers), "Original List", JOptionPane.INFORMATION_MESSAGE);

        TreeSet<Footballer> sortedByName = new TreeSet<>(new CompareByName());
        sortedByName.addAll(footballers);
        JOptionPane.showMessageDialog(null, playerSetToString(sortedByName), "Compared By Name", JOptionPane.INFORMATION_MESSAGE);


        TreeSet<Footballer> sortedByAge = new TreeSet<>(new CompareByAge());
        sortedByAge.addAll(footballers);
        JOptionPane.showMessageDialog(null, playerSetToString(sortedByAge), "Compared By Age", JOptionPane.INFORMATION_MESSAGE);

        filterOver30(footballers);

        System.exit(0);
    }

    public static void filterOver30 (Set<Footballer> players) {
        Iterator<Footballer> playerIterator = players.iterator();
        String message = "";

        while(playerIterator.hasNext()) {
            Player nextPlayer = playerIterator.next();

            if (nextPlayer.getAge() > 30) {
                message += nextPlayer.toString() + "\n\n";
            }
        }

        //JOptionPane.showMessageDialog(null, message);
        JOptionPane.showMessageDialog(null, message, "Only over 30", JOptionPane.INFORMATION_MESSAGE);

    };

    public static String playerSetToString (Set players) {
        Iterator<Player> playerIterator = players.iterator();
        String message = "";

        while(playerIterator.hasNext()) {
            Player nextPlayer = playerIterator.next();

            message += nextPlayer.toString() + "\n\n";
        }

        return message;
    }
}
