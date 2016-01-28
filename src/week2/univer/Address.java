package week2.univer;

/**
 * Created by Iurii on 23.01.2016.
 */
public class Address {

    private String country;
    private String city;
    private String street;
    private int houseNum;

    public Address(String country, String city, String street, int houseNum) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNum = houseNum;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public String asString() {
        return String.format("country:%s,city:%s,street:%s,houseNum:%d",
                country,city,street,houseNum);
    }
}

