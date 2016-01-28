package week2.parking;

import week2.univer.Address;

/**
 * Created by Iurii on 27.01.2016.
 */
public class Parking {
    private boolean state=true;
    private int freeSpaces = 40;
    private int maxSpaces = 40;
    private Address place = new Address("Ukraine", "Kyiv", "Lobanovskogo str.", 12);
    private Motorcycle bikesOnParking [] = new Motorcycle [maxSpaces];
    private String name ;


    public Parking(String name) {
        this.name = name;
    }

    public Parking(int maxSpaces, Address place, String name) {
        this.maxSpaces = maxSpaces;
        this.place = place;
        this.name = name;
    }
    public void close() {
        setState(false);
    }

    public void open () {
        setState(true);
    }

    public void addMotoOnLastFreeSpace(Motorcycle bike) {
        if (state) {
        if(freeSpaces < 1) {
            System.err.println("There no free spaces on the parking!");
        } else {
            for (int i = maxSpaces-1; i >= 0 ; i--) {
                if (bikesOnParking[i]==null) {
                    bikesOnParking[i] = bike;
                    freeSpaces--;
                    break;
                }
            }
        }
        }else System.out.println("Parking closed!");
    }
    public void takeLastMoto() {
        if (state) {
        freeSpaces++;
        bikesOnParking[freeSpaces-1]=null;
        }else System.out.println("Parking closed!");
    }

    public void addMotoByPlaceNumber(Motorcycle bikes, int id) {
        if (state) {
            if (bikesOnParking[id] == null) {
                bikesOnParking[id] = bikes;
                freeSpaces--;
            } else {
                System.out.println("This place isn't empty! PLease select free place from following list: ");
                for (int i = 0; i < maxSpaces; i++) {
                    if (bikesOnParking[i] == null) {
                        System.out.print(i + ", ");
                    }
                }
            }
        }else System.out.println("Parking closed!");
    }

    public void changeAddress(String country, String city, String street, int id) {
        place.setCountry(country);
        place.setCity(city);
        place.setStreet(street);
        place.setHouseNum(id);
    }

    public void showAllInGarage() {

        System.out.println("Parking 1 has:");
        for (int i = 0; i <maxSpaces ; i++) {
            if (bikesOnParking[i]!=null){
            System.out.println(String.format("%s %s id:%s on %s parking place", bikesOnParking[i].getBrand(),bikesOnParking[i].getModel(), bikesOnParking[i].getId(),i));
        }
        }
    }

    public boolean isState() {
        return state;
    }

    public int getFreeSpaces() {
        return freeSpaces;
    }

    public int getMaxSpaces() {
        return maxSpaces;
    }

    public Address getPlace() {
        return place;
    }

    public Motorcycle getBikesOnParking(int id) {
        return bikesOnParking[id];
    }

    public String getName() {
        return name;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public void setFreeSpaces(int freeSpaces) {
        this.freeSpaces = freeSpaces;
    }

    public void setMaxSpaces(int maxSpaces) {
        this.maxSpaces = maxSpaces;
    }

    public void setPlace(Address place) {
        this.place = place;
    }

    public void setBikesOnParking(Motorcycle[] bikesOnParking) {
        this.bikesOnParking = bikesOnParking;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void clearAllGarage() {
        for (int i = 0; i <maxSpaces ; i++) {
            if (bikesOnParking[i]!=null) {
                bikesOnParking[i]=null;
                freeSpaces++;
            }
        }
    }
}

