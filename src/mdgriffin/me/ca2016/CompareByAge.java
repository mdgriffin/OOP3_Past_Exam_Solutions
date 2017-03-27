package mdgriffin.me.ca2016;

import java.util.Comparator;

/**
 * Created by mdgri on 27/03/2017.
 */
public class CompareByAge implements Comparator<Footballer> {
    @Override
    public int compare(Footballer f1, Footballer f2) {
        return (new Integer(f1.getAge()).compareTo(new Integer(f2.getAge())));
    }
}
