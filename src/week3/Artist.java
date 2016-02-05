package week3;

/**
 * Created by Iurii on 05.02.2016.
 */
public abstract class Artist {
    protected String name;
    protected int actCount;
    protected int salary;
    protected double alcoMetersPerWeek=0;

    abstract void act();

    public Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getActCount() {
        return actCount;
    }

    public void setActCount(int actCount) {
        this.actCount = actCount;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary*this.getActCount();
    }

    public double getAlcoMetersPerWeek() {
        return alcoMetersPerWeek;
    }

    public void buhat (String name, double liters) {
        int prom = 0;
        switch (name) {
            case "beer" : prom = 5;
            case "whisky": prom = 40;
            case "vodka": prom = 40;
            case "vine" : prom = 12;
        }
        alcoMetersPerWeek = prom*liters;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", actCount=" + actCount +
                ", salary=" + salary +
                ", alcoMetersPerWeek=" + alcoMetersPerWeek +
                '}';
    }
}
