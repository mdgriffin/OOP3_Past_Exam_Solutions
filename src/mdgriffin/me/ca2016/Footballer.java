package mdgriffin.me.ca2016;

public class Footballer extends Player implements Comparable<Player> {

    String team;

    public Footballer (String name, int age, String team) {
        super(name, age);
        setTeam(team);
    }

    public Footballer () {
        this("No name", 0, "No Team");
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public int compareTo(Player o) {
        return getName().compareTo(o.getName());
    }

    public String toString () {
        return super.toString() + "\nTeam: " + getTeam();
    }
}