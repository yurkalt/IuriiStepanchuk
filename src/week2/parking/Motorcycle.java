package week2.parking;

/**
 * Created by Iurii on 27.01.2016.
 */
public class Motorcycle {
    private String brand;
    private String Model;
    private int id;
    private boolean state;

    public Motorcycle(String brand, String model, int id, boolean state) {
        this.brand = brand;
        Model = model;
        this.id = id;
        this.state = state;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return Model;
    }

    public int getId() {
        return id;
    }

    public boolean isState() {
        return state;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
