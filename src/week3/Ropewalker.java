package week3;

/**
 * Created by Iurii on 05.02.2016.
 */
public class Ropewalker extends Artist  {

    private int bonus=20;

    public Ropewalker(String name) {
        super(name);
    }


    public void setSalary(int salary) {
        this.salary=(salary+salary*bonus/100)*this.getActCount();
    }

    @Override
    public void act() {
        System.out.println(name + " is walking on rope!");
        actCount++;
    }

}
