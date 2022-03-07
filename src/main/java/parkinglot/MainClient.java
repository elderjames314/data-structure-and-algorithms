package parkinglot;

/**
 * @author jamesoladimeji
 * @created 16/01/2022 - 8:28 AM
 * @project IntelliJ IDEA
 */
public class MainClient {
    public static void main(String[] args) {

        ParkingLot parkingLot = new ParkingLot(2, 2, 2);

        Vehicle vehicle = new Vehicle(123, "blue", VehicleType.TRUCK);

        parkingLot.parkVehicle(vehicle);

        parkingLot.unparkVehicle(vehicle);

    }
}
