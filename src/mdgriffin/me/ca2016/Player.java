/**
 * Created by t00187715 on 27/03/2017.
 */
public abstract class Player implements Person {

    protected String name;
    protected int age;

    // no argument cons
    public Player() {
        name = "unknown";
        age = 0;
    }

    //multi argument cons

    public  Player(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract String getName();
    public abstract int getAge();
    public abstract void setName(String name);
    public abstract void setAge(int age);

 public  String toString(){
     return  "Name: " + getName() + "\nAge: " + getAge() ;
 }
}