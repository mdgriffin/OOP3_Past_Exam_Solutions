package mdgriffin.me.ca2016;

import java.util.Comparator;

/**
 * Created by mdgri on 27/03/2017.
 */
public class CompareByName implements Comparator<Footballer> {

    public int compare (Footballer f1, Footballer f2) {
        return f1.getName().compareTo(f2.getName());
    }


}
