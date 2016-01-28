package week2.parking;

/**
 * Created by Iurii on 27.01.2016.
 */
public class Biker {
    private String name;
    private int maxBikes=3;
    private int count=0;
    private Motorcycle bikes []= new Motorcycle[maxBikes];

    public Biker(String name) {
        this.name = name;
    }

    public void buyMoto(Motorcycle add){
        if (count < maxBikes) {
            bikes[count]= add;
            count++;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxBikes(int maxBikes) {
        this.maxBikes = maxBikes;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setBikes(Motorcycle[] bikes) {
        this.bikes = bikes;
    }

    public String getName() {
        return name;
    }

    public int getMaxBikes() {
        return maxBikes;
    }

    public int getCount() {
        return count;
    }

    public Motorcycle getBikes(int id)
    {
        return bikes[id];
    }

    public void sellMoto(int id) {
        for (int i = 0; i < count ; i++) {
            if (bikes[i].getId()==id){
                bikes[i]=null;
                count--;
            }
        }
    }

    public Motorcycle fixMoto(int id) {
        for (int i = 0; i <count ; i++) {
            if(bikes[i].getId()==id) {
                if (bikes[i].isState()) {
                    System.err.println("Bike is in good state and nothing to fix!");
                    return  bikes[i];
                } else {bikes[i].setState(true);
                    return  bikes[i];
                }
            }
        }
        return null;
    }
}

