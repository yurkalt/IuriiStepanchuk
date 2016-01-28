package week2.parking;

/**
 * Created by Iurii on 28.01.2016.
 */
public class TestBiker {
    public static void main(String[] args) {


        Biker biker1 = new Biker("Vsaia");
        Biker biker2 = new Biker("Petia");
        biker1.buyMoto(new Motorcycle ("Honda","CBR",2081,true));
        biker1.buyMoto(new Motorcycle("Honda", "RC", 2285, false));
        biker2.buyMoto(new Motorcycle("Suzuki", "GSX", 1000, true));
        biker2.buyMoto(new Motorcycle("Suzuki", "V-Strom", 99, true));

        biker2.sellMoto(99);
        System.out.println("Petia had 2 bikes and sold V-Strom. Does he have 1 bike now? - " + (biker2.getCount()==1));

        Motorcycle fixed =  biker1.fixMoto(2285);
        System.out.println("Is it in good state now? - " + fixed.isState());

        Parking parking1 = new Parking("OCEAN");
        parking1.addMotoOnLastFreeSpace(biker1.getBikes(0));
        System.out.println("How much free spaces do we have?  39? - " + (parking1.getFreeSpaces()==39));

        //parking1.close();

        parking1.takeLastMoto();
        System.out.println("Looks we have again 40 free spaces. - " + (parking1.getFreeSpaces()==40));
        System.out.println("And last Space is free? " + (parking1.getBikesOnParking(39)==null) );

        //parking1.open();

        parking1.addMotoByPlaceNumber(biker1.getBikes(1), 35);
        System.out.println("Bike was added to the place 35. Is model is RC? - " + parking1.getBikesOnParking(35).getModel().equals("RC"));

        parking1.changeAddress("UK","London", "Shevchenkas str", 1);
        System.out.println("New address is : " + String.format(" %s,  %s, %s, %s ", parking1.getPlace().getCountry(),parking1.getPlace().getCity(),parking1.getPlace().getStreet(),parking1.getPlace().getHouseNum()));

        parking1.addMotoOnLastFreeSpace(biker2.getBikes(0));

        parking1.showAllInGarage();

        System.out.println();

        parking1.clearAllGarage();
        System.out.println("freeSpace 40? - " + parking1.getFreeSpaces());

        parking1.showAllInGarage();

    }



}