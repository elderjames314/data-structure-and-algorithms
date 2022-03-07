package parkinglot;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jamesoladimeji
 * @created 16/01/2022 - 8:13 AM
 * @project IntelliJ IDEA
 */
public class ParkingLot {

    List<CompactSpotType> compactSpotTypes = new ArrayList<>();
    List<LargeSpotType> largeSpotTypes = new ArrayList<>();
    List<BikeSpotType> bikeSpotTypes = new ArrayList<>();

    int freeCompactSpot;
    int freeLargeSpot;
    int freeBikeSpot;

    public ParkingLot(int freeCompactSpot, int freeLargeSpot, int freeBikeSpot) {
        this.freeCompactSpot = freeCompactSpot;
        this.freeLargeSpot = freeLargeSpot;
        this.freeBikeSpot = freeBikeSpot;
    }

    //park vehicle
    public void parkVehicle(Vehicle vehicle) {
        System.out.println("You are about to park your vehicle: "+ vehicle.getVehicleType());
        if(vehicle.getVehicleType().equals(VehicleType.TRUCK)) {

            //check if the free large spot is free
            if(freeLargeSpot > 0) {
                parkYourLargeVehicle(vehicle);
            }else {
                System.out.println("All large spot are full");
            }

        }else if(vehicle.getVehicleType().equals(VehicleType.CAR)) {
            if(freeCompactSpot > 0) {
                parkYourCompactVehicle(vehicle);
            }else if(freeLargeSpot > 0) {
                parkYourLargeVehicle(vehicle);
            }
            else {
                System.out.println("Sorry neither large or compact space is free");
            }

        }else if(vehicle.getVehicleType().equals(VehicleType.BIKE)) {
            if(freeBikeSpot > 0) {
                parkYourBike(vehicle);
            }else if(freeCompactSpot > 0){
                parkYourCompactVehicle(vehicle);
            }else if(freeLargeSpot > 0) {
                parkYourLargeVehicle(vehicle);
            }
            else{
                System.out.println("Sorry, there is no available spot for you to bike, all spots are filled up");
            }

        }else {

        }
    }

    private void parkYourBike(Vehicle vehicle) {
        BikeSpotType bikeSpotType = new BikeSpotType(ParkingSpotType.BIKE);
        bikeSpotType.setFree(false);
        bikeSpotType.setVehicle(vehicle);
        vehicle.setParkingSpot(bikeSpotType);

        bikeSpotTypes.add(bikeSpotType);
        System.out.println("You have successfully parked your bike: "+ vehicle.getVehicleType());
        freeBikeSpot--;
    }

    private void parkYourCompactVehicle(Vehicle vehicle) {
        CompactSpotType compactSpotType = new CompactSpotType(ParkingSpotType.COMPACT);
        compactSpotType.setFree(false);
        compactSpotType.setVehicle(vehicle);
        vehicle.setParkingSpot(compactSpotType);

        compactSpotTypes.add(compactSpotType);
        System.out.println("You have successfully parked your vehicle: "+ vehicle.getVehicleType());
        freeCompactSpot--;
    }

    private void parkYourLargeVehicle(Vehicle vehicle) {
        //create spot
        LargeSpotType largeSpotType = new LargeSpotType(ParkingSpotType.LARGE);
        largeSpotType.setFree(false);
        largeSpotType.setVehicle(vehicle);
        vehicle.setParkingSpot(largeSpotType);

        largeSpotTypes.add(largeSpotType);
        System.out.println("You have successfully parked your vehicle: "+ vehicle.getVehicleType());
        freeLargeSpot--;
    }

    //unpack vehicle
    public void unparkVehicle(Vehicle vehicle) {
        System.out.println("We about to unpark our vehicle; "+ vehicle.getVehicleType());
        ParkingSpot parkingSpot = vehicle.getParkingSpot();
        parkingSpot.setFree(true);
        if(vehicle.getVehicleType().equals(VehicleType.TRUCK)) {
            if(largeSpotTypes.remove(vehicle)) {
                System.out.println("your vehicle has been successfully removed.");
                freeLargeSpot++;
            }else {
                System.out.println("It appears that you do not have vehicle parked in this spot");
            }
        }else if(vehicle.getVehicleType().equals(VehicleType.CAR)) {
            if(compactSpotTypes.remove(vehicle)) {
                System.out.println("your vehicle has removed successfully");
                freeCompactSpot++;
            }else {
                System.out.println("You do not have your vehicle parked in this spot");
            }
        }
        else if(vehicle.getVehicleType().equals(VehicleType.BIKE)) {
            if(bikeSpotTypes.remove(vehicle)) {
                System.out.println("You have successfully removed your bike from the list");
                freeBikeSpot++;
            }else {
                System.out.println("Your bike is not here");
            }
        }
    }
}
