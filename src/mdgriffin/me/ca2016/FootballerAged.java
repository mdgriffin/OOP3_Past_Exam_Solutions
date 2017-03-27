/**
 * Created by t00187715 on 27/03/2017.
 */
public class FootballerAged extends Footballer {


    public FootballerAged (String name, int age, String team) {
        super(name, age, team);
    }

    public FootballerAged () {
        this("No name", 0, "No Team");
    }

    @Override
    public int compareTo(Player o) {
        return (new Integer(getAge()).compareTo(new Integer(o.getAge())));
    }

}
